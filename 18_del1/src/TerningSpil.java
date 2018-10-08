import java.util.Scanner;

public class TerningSpil {
    public static void main(String[] args) {

        System.out.println("Dette er et terning spil");
        System.out.println("Spillet er mellem 2 personer");

        // Scanner lavet, som giver brugeren mulighed for input

        Terning tern = new Terning();
        Scanner Spil = new Scanner(System.in);
        final int MAX = 40;
        int sum = 0, sum1 = 0, sum2 = 0, sum3 = 0;

        // Hvis spiller 1 taster 2, så vil programmet kaste terningen, og lægge de to slået værdier sammen


        while (MAX > sum1 && MAX > sum3) {
            if (MAX > sum1 && MAX > sum3) { //hvorfor "&& sum1 >= 2"?
                System.out.println("Spiller nr.1 kaster");
                System.out.println("Tast 2 for at kaste terningen: ");
            }
            if (Spil.hasNextInt() && Spil.nextInt() == 2) {
                int k1 = tern.kast();
                int k2 = tern.kast();
                sum = k1 + k2;
                sum1 = sum + sum1;
                System.out.println(k1 + " " + k2);
                if (k1 + k2 == 2){
                    System.out.println("Spiller 1. mister alle sine point.");
                    sum1=0;
                } else {
                    System.out.println("Summen af kastet er: " + sum);
                }
                System.out.println("Spiller nr.1 har " + sum1 + " point");
            } else {
                System.out.println("Forkert input... Tast 2 for at kaste terningen: ");
            }
            if (MAX > sum1 && MAX > sum3) {
                System.out.println("Spiller nr.2 kaster");
                System.out.println("Tast 2 for at kaste terningen: ");
                if (Spil.hasNextInt() && Spil.nextInt() == 2) {
                    int k3 = tern.kast();
                    int k4 = tern.kast();
                    sum2 = k3 + k4;
                    sum3 = sum2 + sum3;
                    System.out.println(k3 + " " + k4);
                    if (k3 + k4 == 2){
                        System.out.println("Spiller 1. mister alle sine point.");
                        sum3=0;
                    } else {
                        System.out.println("Summen af kastet er: " + sum2);
                    }
                    System.out.println("Spiller nr.2 har " + sum3 + " point");
                } else {
                    System.out.println("Forkert input... Tast 2 for at kaste terningen: ");
                }
            }
        }
        if (MAX <= sum1) {
            System.out.println("Spiller nr.1 vandt");
        } else if (MAX <= sum3) {
            System.out.println("Spiller nr.2 vandt");
        }
    }
}
