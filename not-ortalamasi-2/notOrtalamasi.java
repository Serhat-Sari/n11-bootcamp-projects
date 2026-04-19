import java.util.Scanner;

public class notOrtalamasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] dersler = {"Matematik", "Fizik", "Kimya", "Türkçe", "Tarih", "Müzik"};
        int toplam = 0;
        int gecerliDersSayisi = 0;

        for (int i = 0; i < dersler.length; i++) {
            System.out.print(dersler[i] + " notunuzu giriniz: ");
            int not = input.nextInt();

            if (not >= 0 && not <= 100) {
                toplam += not;
                gecerliDersSayisi++;
            } else {
                System.out.println("Geçersiz not! " + dersler[i] + " dersi ortalamaya katılmayacak.");
            }
        }

        if (gecerliDersSayisi == 0) {
            System.out.println("Geçerli not girilmedi, ortalama hesaplanamıyor.");
        } else {
            double ortalama = (double) toplam / gecerliDersSayisi;
            System.out.println("Ortalama : " + ortalama);
            String sonuc = ortalama > 60 ? "Sınıfı geçti" : "Sınıfta kaldı";
            System.out.println(sonuc);
        }

        input.close();
    }
}