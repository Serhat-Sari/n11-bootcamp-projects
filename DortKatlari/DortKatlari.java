import java.util.Scanner;

public class DortKatlari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        int sayi;

        System.out.println("Tek sayı girene kadar 4'ün katlarını topluyoruz.");

        do {
            System.out.print("Sayı giriniz: ");
            sayi = scanner.nextInt();

            // Sayı 4'ün katıysa toplama ekle
            if (sayi % 4 == 0) {
                toplam += sayi;
            }
        } while (sayi % 2 == 0); // Sayı çift olduğu sürece (tek olana kadar) devam et

        System.out.println("Girilen 4'ün katı olan sayıların toplamı: " + toplam);
        scanner.close();
    }
}