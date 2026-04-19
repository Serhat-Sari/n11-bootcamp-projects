import java.util.Scanner;

public class BasamakToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        int tempSayi = sayi; // Sayının orijinal halini saklamak için
        int toplam = 0;
        int basamakDegeri;

        // Sayı 0 olana kadar döngüyü çalıştır
        while (tempSayi != 0) {
            // Modül 10 alarak son basamağı bul (Örn: 1643 % 10 = 3)
            basamakDegeri = tempSayi % 10;
            
            // Bulunan basamağı toplama ekle
            toplam += basamakDegeri;
            
            // Sayıyı 10'a bölerek son basamağı at (Örn: 1643 / 10 = 164)
            tempSayi /= 10;
        }

        System.out.println(sayi + " sayısının basamakları toplamı: " + toplam);

        input.close();
    }
}