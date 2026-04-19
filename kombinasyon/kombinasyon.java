import java.util.Scanner;

public class kombinasyon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("n değerini giriniz: ");
        int n = input.nextInt();

        System.out.print("r değerini giriniz: ");
        int r = input.nextInt();

        if (n >= r && n >= 0 && r >= 0) {
            long sonuc = kombinasyonHesapla(n, r);
            System.out.println("C(" + n + "," + r + ") = " + sonuc);
        } else {
            System.out.println("Hata: n değeri r değerinden büyük veya eşit olmalı ve sayılar negatif olmamalıdır.");
        }

        input.close();
    }

    // Faktoriyel hesaplayan metot
    public static long faktoriyel(int sayi) {
        long sonuc = 1;
        for (int i = 1; i <= sayi; i++) {
            sonuc *= i;
        }
        return sonuc;
    }

    // Kombinasyon formülünü uygulayan metot
    public static long kombinasyonHesapla(int n, int r) {
        // Formül: C(n,r) = n! / (r! * (n-r)!)
        return faktoriyel(n) / (faktoriyel(r) * faktoriyel(n - r));
    }
}