import java.util.Scanner;

public class RecursivePattern {

    // Ana recursive metodumuz
    // n: anlık değer, original: başlangıçtaki değer (durağı bilmek için)
    static void pattern(int n, int original) {
        System.out.print(n + " ");

        // Eğer sayı pozitifse azaltmaya devam et
        if (n > 0) {
            pattern(n - 5, original);
            // Stack'ten dönerken (artırma aşaması) tekrar yazdır
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N Sayısı: ");
        int n = scanner.nextInt();

        pattern(n, n);
        
        scanner.close();
    }
}