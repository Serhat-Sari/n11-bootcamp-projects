import java.util.Scanner;

public class not {
    public static void main(String[] args){
        int mat,fiz,kim,tur,tarih,muzik;
        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz: ");
        mat = input.nextInt();
        System.out.println("Fizik notunuzu giriniz: ");
        fiz = input.nextInt();
        System.out.println("Kimya notunuzu giriniz: ");
        kim = input.nextInt();
        System.out.println("Türkçe notunuzu giriniz: ");
        tur = input.nextInt();
        System.out.println("Tarih notunuzu giriniz: ");
        tarih = input.nextInt();
        System.out.println("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();

        String sonuc = (mat + fiz + kim + tur + tarih + muzik) / 6 > 60 ? "Sınıfı geçti" : "Sınıfta kaldı";
        System.out.println(sonuc);
    }
}
