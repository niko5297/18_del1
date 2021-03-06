import java.util.Scanner;

public class TerningSpil {
    public static void main(String[] args) {

        // Scanner, metode og variable defineret.
        Terning tern = new Terning();
        Scanner Spil = new Scanner(System.in);
        final int MAX = 40;
        int kastsum1 = 0, point1 = 0, k1 = 0, k2 = 0, gemk1 = 0, gemk2 = 0; //Spiller 1, k = kast
        int kastsum2 = 0, point2 = 0, k3 = 0, k4 = 0, gemk3 = 0, gemk4 = 0; //Spiller 2, gemk = forrige kast
        boolean to6_1 = false, to6_2 = false; //2 6'ere i træk
        boolean forkert; //fejlinput

        // Hvis spiller 1 taster 2, så vil programmet kaste terningen, og lægge de to slået værdier sammen

        //Instukser til Spillerne
        System.out.println("Dette er et terning spil mellem 2 personer");
        System.out.println("Hver runde lægges summen af ens slag til ens point");
        System.out.println("Man mister alle sine point, hvis man slår 2*1, men slår man 2 ens, får man et ekstra slag");
        System.out.println("Den som først slår 2 ens, efter at have 40 point vinner");
        System.out.println("Ellers kan man også vinde, hvis man slår 2 6'ere, 2 gange i træk");

        //Selve spillet
        while ((k1 != k2 && k3 != k4 || (point1 - (kastsum1)) < MAX && (point2 - (kastsum2)) < MAX) && !to6_1 && !to6_2) {
            System.out.println();
            System.out.println("Spiller nr.1 kaster");
            do {
                forkert = false;
                System.out.println("Tast 2 for at kaste terningen: ");
                k1 = tern.kast();
                k2 = tern.kast();
                String kast = Spil.nextLine();
                if (kast.equals("2")) {  //tjekker for korrekt input
                    kastsum1 = k1 + k2;
                    point1 += kastsum1;
                    System.out.println(k1 + " " + k2);
                    if (k1 + k2 == 2) { //tjekker om slaget var 2 ettere
                        System.out.println("Spiller 1. mister alle sine point.");
                        point1 = 0;
                    } else {
                        System.out.println("Summen af kastet er: " + kastsum1);
                    }

                    System.out.println("Spiller nr.1 har " + point1 + " point");

                    //Tjekker for 4 6'ere inden for 2 kast af samme spiller
                    if (gemk1 + gemk2 == 12 && k1 + k2 == gemk1 + gemk2) {
                        to6_1 = true;
                    }
                    gemk1 = k1;
                    gemk2 = k2;

                    if (k1 == k2 && MAX > point1 && !to6_1) { //specialt udprint ved ekstra slag
                        System.out.println();
                        System.out.println("Spiller 1. får et ekstra slag");
                    }
                } else {
                    System.out.println("Forkert input...");
                    forkert = true;
                }
            } while (k1 == k2 && MAX > point1 && !to6_1 || forkert); //tjekker for 2 ens

            //Hvis spiller 1 ikke har vundet, er det spiller 2's tur.
            if ((MAX > point1 || k1 != k2) && !to6_1) {
                System.out.println();
                System.out.println("Spiller nr.2 kaster");
                do {
                    forkert = false;
                    System.out.println("Tast 2 for at kaste terningen: ");
                    k3 = tern.kast();
                    k4 = tern.kast();
                    String kast2 = Spil.nextLine();
                    if (kast2.equals("2")) {
                        kastsum2 = k3 + k4;
                        point2 += kastsum2;
                        System.out.println(k3 + " " + k4);
                        if (k3 + k4 == 2) {
                            System.out.println("Spiller 1. mister alle sine point.");
                            point2 = 0;
                        } else {
                            System.out.println("Summen af kastet er: " + kastsum2);
                        }

                        System.out.println("Spiller nr.2 har " + point2 + " point");

                        if (gemk3 + gemk4 == 12 && k3 + k4 == gemk3 + gemk4) {
                            to6_2 = true;
                        }
                        gemk3 = k3;
                        gemk4 = k4;

                        if (k3 == k4 && MAX > point2 && !to6_2) {
                            System.out.println();
                            System.out.println("Spiller 2. får et ekstra slag");
                        }
                    } else {
                        System.out.println("Forkert input...");
                        forkert = true;
                    }
                } while (k3 == k4 && MAX > point2 && !to6_2 || forkert);
            }
        }
        Spil.close();
        //spillet er slut og vinderen findes.
        if (MAX <= point1-kastsum1 && k1 == k2 || to6_1) {
            System.out.println();
            System.out.println("Spiller nr.1 vandt");
        } else {
            System.out.println();
            System.out.println("Spiller nr.2 vandt");
        }
    }
}
