public class HarmonikOrtalama {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int n = numbers.length;
        double harmonikSeri = 0;

        for (int i = 0; i < n; i++) {
            harmonikSeri += 1.0 / numbers[i];
        }

        double harmonikOrtalama = n / harmonikSeri;

        System.out.println("Harmonik Ortalama: " + harmonikOrtalama);
    }
}