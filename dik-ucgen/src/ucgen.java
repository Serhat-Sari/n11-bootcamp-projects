import java.util.Scanner;

class ucgen{
    public static void main(String[] args){
        int a,b;
        double c, cevre, u;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen üçgenin dik kenarlarını giriniz: ");
        a = input.nextInt();
        b = input.nextInt();
        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs: " + c);
        cevre = a+b+c;
        u = cevre / 2;
        System.out.println("Üçgenin alanı: " + Math.sqrt(( u * (u-a) * (u-b) * (u-c))));
    }
}
