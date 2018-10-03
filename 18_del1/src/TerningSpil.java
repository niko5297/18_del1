import java.sql.SQLOutput;
import java.util.Scanner;

public class TerningSpil {
    public static void main (String[]args){

        System.out.println("Dette er et terning spil");
        System.out.println("Spillet er mellem 2 personer");
        System.out.println("Spiller nr.1 kaster");

        // Scanner lavet, som giver brugeren mulighed for input //

        Terning tern = new Terning();
        Scanner Spil = new Scanner(System.in);

        System.out.println("Tast 2 for at kaste terningen: ");

        if (Spil.nextInt()==2){
            tern.kast();
            System.out.println(tern.kast());
        }
        else {
            System.out.println("Forkert input... Tast 2 for at kaste terningen: ");
        }





    }
}
