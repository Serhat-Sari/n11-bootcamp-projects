import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        int n1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int n2 = input.nextInt();

        int ebob = 1;
        
        // EBOB için küçük olan sayıdan başlayarak geriye doğru gidiyoruz
        int i = (n1 < n2) ? n1 : n2; // Ternary operatör ile küçük sayıyı seçiyoruz

        while (i >= 1) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
                break; // En büyük ortak böleni bulduğumuz an döngüyü kırıyoruz
            }
            i--;
        }

        System.out.println("EBOB: " + ebob);

        // EKOK hesaplaması için verdiğin formülü kullanıyoruz
        int ekok = (n1 * n2) / ebob;
        System.out.println("EKOK: " + ekok);

        input.close();
    }
}