public class transpose {
    public static void main(String[] args) {
        int[][] matris = {
            {2, 3, 4},
            {5, 6, 4}
        };

        int satir = matris.length;
        int sutun = matris[0].length;

        int[][] transpoze = new int[sutun][satir];

        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                transpoze[j][i] = matris[i][j];
            }
        }

        System.out.println("Matris : ");
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.printf("%-5d", matris[i][j]);
            }
            System.out.println();
        }

        System.out.println("Transpoze : ");
        for (int i = 0; i < sutun; i++) {
            for (int j = 0; j < satir; j++) {
                System.out.printf("%-5d", transpoze[i][j]);
            }
            System.out.println();
        }
    }
}