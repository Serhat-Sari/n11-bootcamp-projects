import java.util.Scanner;

public class ucak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        double mesafe = scanner.nextDouble();

        System.out.print("Yaşınızı giriniz : ");
        int yas = scanner.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        int yolculukTipi = scanner.nextInt();

        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("\nHatalı Veri Girdiniz !");
            scanner.close();
            return;
        }

        double normalTutar = mesafe * 0.10;

        double yasIndirimOrani = 0;
        if (yas < 12) {
            yasIndirimOrani = 0.50;
        } else if (yas <= 24) {
            yasIndirimOrani = 0.10;
        } else if (yas > 65) {
            yasIndirimOrani = 0.30;
        }

        double yasIndirimi   = normalTutar * yasIndirimOrani;
        double indirimliTutar = normalTutar - yasIndirimi;

        double toplamTutar;
        if (yolculukTipi == 2) {
            double gidisDonusIndirimi = indirimliTutar * 0.20;
            toplamTutar = (indirimliTutar - gidisDonusIndirimi) * 2;
        } else {
            toplamTutar = indirimliTutar;
        }

        System.out.println("\nToplam Tutar = " + toplamTutar + " TL");

        scanner.close();
    }
}