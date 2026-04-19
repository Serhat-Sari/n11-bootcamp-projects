import java.util.Scanner;

public class Main {

    static boolean isPrime(int n, int divisor) {
        if (n < 2)          return false;
        if (divisor == 1)   return true;
        if (n % divisor == 0) return false;
        return isPrime(n, divisor - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        int n = scanner.nextInt();

        if (isPrime(n, n / 2)) {
            System.out.println(n + " sayısı ASALDIR !");
        } else {
            System.out.println(n + " sayısı ASAL değildir !");
        }

        scanner.close();
    }
}