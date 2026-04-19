import java.util.Scanner;
import java.util.Arrays;

public class ucsayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] sayilar = new int[3];

        System.out.println("Lütfen üç sayı giriniz:");
        for(int i = 0; i < sayilar.length; i++) {
            sayilar[i] = input.nextInt();
        }

        // Diziyi küçükten büyüğe sıralar
        Arrays.sort(sayilar);

        System.out.println("Küçükten büyüğe sıralama:");
        for(int s : sayilar) {
            System.out.print(s + " ");
        }
        
        input.close();
    }
}