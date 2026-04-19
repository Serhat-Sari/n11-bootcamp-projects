import java.util.Random;
import java.util.Scanner;

public class MayinTarlasi {

    private int rows;
    private int cols;
    private int mineCount;
    private String[][] mineMap;
    private String[][] playerMap;
    private int openedCells;
    private Scanner scanner;

    public MayinTarlasi(int rows, int cols) {
        this.rows      = rows;
        this.cols      = cols;
        this.mineCount = (rows * cols) / 4;
        this.mineMap   = new String[rows][cols];
        this.playerMap = new String[rows][cols];
        this.openedCells = 0;
        this.scanner   = new Scanner(System.in);
    }

    private void initMaps() {
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) {
                mineMap[i][j]   = "-";
                playerMap[i][j] = "-";
            }
    }

    private void placeMines() {
        Random random = new Random();
        int placed = 0;
        while (placed < mineCount) {
            int r = random.nextInt(rows);
            int c = random.nextInt(cols);
            if (!mineMap[r][c].equals("*")) {
                mineMap[r][c] = "*";
                placed++;
            }
        }
    }

    private void printMap(String[][] map) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(map[i][j]);
                if (j < cols - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }

    private int countAdjacentMines(int r, int c) {
        int count = 0;
        for (int dr = -1; dr <= 1; dr++)
            for (int dc = -1; dc <= 1; dc++) {
                if (dr == 0 && dc == 0) continue;
                int nr = r + dr;
                int nc = c + dc;
                if (nr >= 0 && nr < rows && nc >= 0 && nc < cols)
                    if (mineMap[nr][nc].equals("*")) count++;
            }
        return count;
    }

    private int[] getValidCoordinate() {
        while (true) {
            System.out.print("Satır Giriniz : ");
            int r = scanner.nextInt();
            System.out.print("Sütun Giriniz : ");
            int c = scanner.nextInt();

            if (r < 0 || r >= rows || c < 0 || c >= cols) {
                System.out.println("Geçersiz koordinat! Lütfen sınırlar içinde bir değer girin.");
                continue;
            }
            if (!playerMap[r][c].equals("-")) {
                System.out.println("Bu koordinat daha önce seçildi, başka bir koordinat girin.");
                continue;
            }
            return new int[]{r, c};
        }
    }

    private boolean checkWin() {
        int totalSafe = rows * cols - mineCount;
        return openedCells == totalSafe;
    }

    public void start() {
        initMaps();
        placeMines();

        System.out.println("Mayınların Konumu");
        printMap(mineMap);
        System.out.println("===========================");
        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");
        printMap(playerMap);

        while (true) {
            int[] coord = getValidCoordinate();
            int r = coord[0];
            int c = coord[1];

            System.out.println("===========================");

            if (mineMap[r][c].equals("*")) {
                System.out.println("Game Over!!");
                System.out.println("===========================");
                break;
            }

            int adjacent = countAdjacentMines(r, c);
            playerMap[r][c] = String.valueOf(adjacent);
            openedCells++;

            if (checkWin()) {
                System.out.println("Oyunu Kazandınız !");
                printMap(playerMap);
                System.out.println("===========================");
                break;
            }

            printMap(playerMap);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = 0, cols = 0;

        while (true) {
            System.out.print("Satır sayısını giriniz: ");
            rows = scanner.nextInt();
            System.out.print("Sütun sayısını giriniz: ");
            cols = scanner.nextInt();

            if (rows >= 2 && cols >= 2) break;
            System.out.println("Uyarı: Matris boyutu minimum 2x2 olmalıdır. Tekrar giriniz.");
        }

        MayinTarlasi game = new MayinTarlasi(rows, cols);
        game.start();
    }
}