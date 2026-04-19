import java.util.Scanner;

public class GirisYap {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        String userName = inp.nextLine();

        System.out.print("Şifreniz : ");
        String password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız !");
        } else {
            System.out.println("Bilgileriniz Yanlış !");

            System.out.print("Şifrenizi sıfırlamak ister misiniz? (E/H) : ");
            String cevap = inp.nextLine();

            if (cevap.equalsIgnoreCase("E")) {
                System.out.print("Yeni şifrenizi giriniz : ");
                String yeniSifre = inp.nextLine();

                if (yeniSifre.equals(password)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu !");
                }
            } else {
                System.out.println("Şifre sıfırlama iptal edildi.");
            }
        }

        inp.close();
    }
}