import java.util.Scanner;

public class EnBuyukEnKucuk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = input.nextInt();

        // Kullanıcı hatalı adet girerse diye kontrol
        if (n <= 0) {
            System.out.println("Lütfen pozitif bir adet giriniz.");
        } else {
            // İlk sayıyı alıp başlangıç değerleri olarak atıyoruz
            System.out.print("1. Sayıyı giriniz: ");
            int ilkSayi = input.nextInt();
            
            int enBuyuk = ilkSayi;
            int enKucuk = ilkSayi;

            // Kalan (n-1) sayı için döngüyü başlatıyoruz
            for (int i = 2; i <= n; i++) {
                System.out.print(i + ". Sayıyı giriniz: ");
                int sayi = input.nextInt();

                if (sayi > enBuyuk) {
                    enBuyuk = sayi;
                }
                
                if (sayi < enKucuk) {
                    enKucuk = sayi;
                }
            }

            System.out.println("En büyük sayı: " + enBuyuk);
            System.out.println("En küçük sayı: " + enKucuk);
        }

        input.close();
    }
}