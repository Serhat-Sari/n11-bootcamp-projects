import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args){
        double perKm = 2.20, base = 10, totalCost;
        int kilometer;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen km'yi giriniz: ");
        kilometer =  input.nextInt();
        totalCost = kilometer * perKm + base;
        if(totalCost < 20) totalCost = 20;
        System.out.println(STR."Ucret: \{totalCost}");
    }
}
