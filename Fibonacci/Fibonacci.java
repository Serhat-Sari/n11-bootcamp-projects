import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci serisinin eleman sayısını giriniz: ");
        int n = input.nextInt();

        int a = 0; // İlk sayı
        int b = 1; // İkinci sayı

        System.out.print(n + " Elemanlı Fibonacci Serisi: ");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            
            // Yeni sayıyı hesapla
            int next = a + b;
            
            // Değişkenleri güncelle
            a = b;
            b = next;
        }

        input.close();
    }
}