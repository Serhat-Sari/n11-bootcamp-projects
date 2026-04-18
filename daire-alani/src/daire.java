import java.util.Scanner;

public class daire {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double r;
        final double pi = 3.14;
        System.out.println("Lütfen dairenin yarıçapını giriniz: ");
        r = input.nextDouble();
        System.out.println("Daire alanı: " + (pi * r * r));
        System.out.println("Daire çevresi: " + (2 * pi * r));
    }
}
