import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {
            System.out.print("Kullanıcı Adınız : ");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                
                do {
                    System.out.println("\n1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Para miktarı : ");
                            int yatirilan = input.nextInt();
                            balance += yatirilan;
                            break;
                            
                        case 2:
                            System.out.print("Para miktarı : ");
                            int cekilen = input.nextInt();
                            if (cekilen > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= cekilen;
                            }
                            break;
                            
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                            
                        case 4:
                            System.out.println("Tekrar görüşmek üzere.");
                            break;
                            
                        default:
                            System.out.println("Geçersiz bir işlem seçtiniz.");
                            break;
                    }
                } while (select != 4);
                
                break; // Başarılı girişten sonra döngüden çık
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
        input.close();
    }
}