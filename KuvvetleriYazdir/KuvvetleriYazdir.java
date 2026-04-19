import java.util.Scanner;

public class KuvvetleriYazdir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sınır sayısını giriniz: ");
        int n = input.nextInt();

        System.out.println("4'ün kuvvetleri:");
        // 4'ün kuvvetleri: 4^0=1, 4^1=4, 4^2=16...
        for (int i = 1; i <= n; i *= 4) {
            System.out.println(i);
        }

        System.out.println("5'in kuvvetleri:");
        // 5'in kuvvetleri: 5^0=1, 5^1=5, 5^2=25...
        for (int i = 1; i <= n; i *= 5) {
            System.out.println(i);
        }

        input.close();
    }
}