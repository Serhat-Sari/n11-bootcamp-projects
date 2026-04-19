import java.util.Scanner;

public class ElmasYildiz {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("Elmasın üst kısmı için bir sayı (satır sayısı) giriniz: ");
        int n = klavye.nextInt();

        // 1. Üst Kısım (Pyramid)
        for (int i = 0; i < n; i++) {
            // Boşluklar
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print(" ");
            }
            // Yıldızlar
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2. Alt Kısım (Inverted Pyramid)
        // n-1'den başlatıyoruz çünkü en geniş satırı üst kısımda zaten bastırdık
        for (int i = n - 2; i >= 0; i--) {
            // Boşluklar
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print(" ");
            }
            // Yıldızlar
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        klavye.close();
    }
}