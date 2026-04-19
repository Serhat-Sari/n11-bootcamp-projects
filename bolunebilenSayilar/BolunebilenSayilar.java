import java.util.Scanner;

public class BolunebilenSayilar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        int toplam = 0;
        int sayac = 0;

        for (int i = 0; i <= sayi; i++) {
            // Hem 3'e hem 4'e bölünen sayılar aynı zamanda 12'ye de tam bölünür
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                sayac++;
            }
        }

        // Sıfıra bölme hatasını önlemek için kontrol yapıyoruz
        if (sayac > 0) {
            double ortalama = (double) toplam / sayac;
            System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + ortalama);
        } else {
            System.out.println("Girilen aralıkta 3 ve 4'e tam bölünen bir sayı bulunamadı.");
        }

        input.close();
    }
}