import java.util.Scanner;

public class kdv {
    public static void main(String[] args) {
        double para, kdv, yeniTutar;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen para tutarını giriniz:");
        para = input.nextDouble();
        kdv = para > 1000 ? 8 : 18;
        yeniTutar = para + (para * (kdv/100));
        System.out.println("KDV oranı: " + kdv);
        System.out.println("KDV'li tutar: " + yeniTutar);
        System.out.println("KDV tutarı: " + (yeniTutar - para) );
    }
}
