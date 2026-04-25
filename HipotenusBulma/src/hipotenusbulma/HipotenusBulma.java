package hipotenusbulma;

import java.util.Scanner;

public class HipotenusBulma {

    public static void main(String[] args) {
        System.out.println("---HIPOTENUS BULMA---");
        Scanner input = new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.print("A kenari girin: ");
        a = input.nextDouble();
        System.out.print("B kenari girin: ");
        b = input.nextDouble();
        
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("En uzun kenar: " + c    );
    }
    
}
