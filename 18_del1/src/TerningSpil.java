import java.util.Scanner;

public class TerningSpil {
    public static void main (String[]args){

        System.out.println("Dette er et terning spil");
        System.out.println("Spillet er mellem 2 personer");
        System.out.println("Spiller nr.1 kaster");

        // Scanner lavet, som giver brugeren mulighed for input //

        Terning tern = new Terning();
        Scanner Spil = new Scanner(System.in);

        // Hvis spiller 1 taster 2, så vil programmet kaste terningen, og lægge de to slået værdier sammen //

            while(true){
                System.out.println("Tast 2 for at kaste terningen: ");
                if (Spil.nextInt() == 2) {
                int k1 = tern.kast();
                int k2 = tern.kast();
                int sum = k1+k2;
                System.out.print(k1 + " ");
                System.out.println(k2);
                System.out.println("Summen af kastet er: " + sum );
            }
            else {
                System.out.println("Forkert input... Tast 2 for at kaste terningen: ");
            }
        }





    }
}
