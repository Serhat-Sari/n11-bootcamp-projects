import java.util.Scanner;

public class MinMaxArray {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Girilen Sayı : ");
        int sayi = scanner.nextInt();

        int kucukEnYakin = Integer.MIN_VALUE;
        int buyukEnYakin = Integer.MAX_VALUE;

        for (int eleman : list) {
            if (eleman < sayi && eleman > kucukEnYakin) {
                kucukEnYakin = eleman;
            }
            if (eleman > sayi && eleman < buyukEnYakin) {
                buyukEnYakin = eleman;
            }
        }

        if (kucukEnYakin == Integer.MIN_VALUE) {
            System.out.println("Girilen sayıdan küçük eleman bulunamadı.");
        } else {
            System.out.println("Girilen sayıdan küçük en yakın sayı : " + kucukEnYakin);
        }

        if (buyukEnYakin == Integer.MAX_VALUE) {
            System.out.println("Girilen sayıdan büyük eleman bulunamadı.");
        } else {
            System.out.println("Girilen sayıdan büyük en yakın sayı : " + buyukEnYakin);
        }

        scanner.close();
    }
}