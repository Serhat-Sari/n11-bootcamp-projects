public class AsalSayilar {
    public static void main(String[] args) {
        
        // 1 asal sayı olmadığı için döngüyü 2'den başlatıyoruz
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;

            // Sayının asal olup olmadığını kontrol ediyoruz
            // 2'den başlayarak sayının kendisine kadar olan sayılara bölüyoruz
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break; // Eğer bir sayıya tam bölünüyorsa asal değildir, döngüyü kır
                }
            }

            // Eğer isPrime true ise (hiçbir sayıya tam bölünmediyse), ekrana yaz
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}