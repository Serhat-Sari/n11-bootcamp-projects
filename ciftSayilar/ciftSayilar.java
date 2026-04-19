import java.util.Scanner;

public class ciftSayilar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        System.out.println(sayi + " sayısına kadar olan çift sayılar:");
        for (int i = 0; i <= sayi; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        
        input.close();
    }
}