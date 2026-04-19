import java.util.Scanner;

public class TekrarEden {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 2, 6, 4, 8, 2, 10, 6};

        System.out.println("Dizi: ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println("Tekrar eden çift sayılar: ");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) continue;

            boolean tekrar = false;
            for (int j = 0; j < i; j++) {
                if (numbers[j] == numbers[i]) {
                    tekrar = true;
                    break;
                }
            }

            boolean daha_once_yazildi = false;
            if (tekrar) {
                for (int k = 0; k < i; k++) {
                    if (numbers[k] == numbers[i]) {
                        daha_once_yazildi = true;
                        break;
                    }
                }
                if (!daha_once_yazildi) {
                    System.out.println(numbers[i] + " sayısı tekrar ediyor.");
                }
            }
        }
    }
}