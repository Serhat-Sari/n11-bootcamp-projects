import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("n sayısını giriniz: ");
        int n = input.nextInt();

        // Sonucun küsuratlı olma ihtimaline karşı double kullanıyoruz
        double harmonikSeri = 0.0;

        for (int i = 1; i <= n; i++) {
            // Önemli: 1/i yazarsak Java bunu "tam sayı bölmesi" olarak algılar ve 
            // 1 hariç sonuçlar 0 çıkar. 1.0/i yazarak "ondalıklı bölme" yapıyoruz.
            harmonikSeri += (1.0 / i);
        }

        System.out.println(n + " sayısının harmonik serisi: " + harmonikSeri);

        input.close();
    }
}