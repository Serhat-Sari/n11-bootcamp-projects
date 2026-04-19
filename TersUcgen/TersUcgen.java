import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Basamak Sayısı : ");
        int n = input.nextInt();

        // i, satır sayısını temsil eder ve n'den 1'e kadar azalır
        for (int i = n; i >= 1; i--) {
            
            // Boşlukları yazdır (sola yaslı görüntü için)
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            
            // Yıldızları yazdır (2*i - 1 formülü ile tek sayıda artış/azalış sağlanır)
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }
            
            // Alt satıra geç
            System.out.println();
        }

        input.close();
    }
}