public class frequency {
    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};
        boolean[] islendi = new boolean[dizi.length];

        System.out.print("Dizi : [");
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i]);
            if (i < dizi.length - 1) System.out.print(", ");
        }
        System.out.println("]");

        System.out.println("Tekrar Sayıları");

        for (int i = 0; i < dizi.length; i++) {
            if (islendi[i]) continue;

            int frekans = 1;
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[j] == dizi[i]) {
                    frekans++;
                    islendi[j] = true;
                }
            }

            System.out.println(dizi[i] + " sayısı " + frekans + " kere tekrar edildi.");
            islendi[i] = true;
        }
    }
}