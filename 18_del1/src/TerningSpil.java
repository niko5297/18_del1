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
        int k1,k2,k3,k4;

        // Hvis spiller 1 taster 2, så vil programmet kaste terningen, og lægge de to slået værdier sammen


        while (MAX > sum1 && MAX > sum3) {
            System.out.println();
            System.out.println("Spiller nr.1 kaster");
            do {
                System.out.println("Tast 2 for at kaste terningen: ");
                 k1 = tern.kast();
                 k2 = tern.kast();
                if (Spil.hasNextInt() && Spil.nextInt() == 2) {
                    sum = k1 + k2;
                    sum1 = sum + sum1;
                    System.out.println(k1 + " " + k2);
                    if (k1 + k2 == 2) {
                        System.out.println("Spiller 1. mister alle sine point.");
                        sum1 = 0;
                    } else {
                        System.out.println("Summen af kastet er: " + sum);
                    }
                    System.out.println("Spiller nr.1 har " + sum1 + " point");
                } else {
                    System.out.println("Forkert input... Tast 2 for at kaste terningen: ");
                }
                if(k1==k2 && MAX > sum1 && k1+k2!=2){
                    System.out.println();
                    System.out.println("Spiller 1. får et ekstra slag");
                }
            }while(k1 == k2 && MAX > sum1 && k1+k2!=2);
            if (MAX > sum1) {  //"&& MAX > sum3" behøves ikke, eftersom dette er forsikret af vores løkke, og er endu ikke blevet ændret inden i løkken.
                System.out.println();
                System.out.println("Spiller nr.2 kaster");
                do {
                    System.out.println("Tast 2 for at kaste terningen: ");
                    k3 = tern.kast();
                    k4 = tern.kast();
                    if (Spil.hasNextInt() && Spil.nextInt() == 2) {
                        sum2 = k3 + k4;
                        sum3 = sum2 + sum3;
                        System.out.println(k3 + " " + k4);
                        if (k3 + k4 == 2) {
                            System.out.println("Spiller 1. mister alle sine point.");
                            sum3 = 0;
                        } else {
                            System.out.println("Summen af kastet er: " + sum2);
                        }
                        System.out.println("Spiller nr.2 har " + sum3 + " point");
                    } else {
                        System.out.println("Forkert input... Tast 2 for at kaste terningen: ");
                    }
                    if(k3==k4 && MAX > sum3 && k3+k4!=2){
                        System.out.println();
                        System.out.println("Spiller 2. får et ekstra slag");
                    }
                }while(k3==k4 && MAX > sum3 && k3+k4!=2);
            }
        }
        if (MAX <= sum1) {
            System.out.println();
            System.out.println("Spiller nr.1 vandt");
        } else {  //if (MAX <= sum3) er igen ikke nødvendigt, eftersom løkken ikke stopper, før en af de 2 summe er over 40 (og hvis ikke det er sum1, MÅ det være sum3).
            System.out.println();
            System.out.println("Spiller nr.2 vandt");
        }
    }
}
