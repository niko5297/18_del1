import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TerningTest {

    Terning T = new Terning();

    @Test
    public void kast() {

        for (int i = 0; i < 1000; i++) {
            int tal = T.kast();
            assertTrue(tal > 0 && tal < 7);
        }
        int SammeSum=0;
        int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i_1=0,j=0,k=0;
        for (int i=0; i<12000; i++){
            int kast_1=T.kast();
            int kast_2=T.kast();
            int tal = kast_1+kast_2;

            if(kast_1==kast_2){
                ++SammeSum;
            }
            if (tal==2){
                a++;
            }
            if (tal==3){
                b++;
            }
            if (tal==4){
                c++;
            }
            if (tal==5){
                d++;
            }
            if (tal==6){
                e++;
            }
            if (tal==7){
                f++;
            }
            if (tal==8){
                g++;
            }
            if (tal==9){
                h++;
            }
            if (tal==10){
                i_1++;
            }
            if (tal==11){
                j++;
            }
            if (tal==12){
                k++;
            }

        }
        System.out.println("2 Øjne = " +a);
        System.out.println("3 Øjne = " +b);
        System.out.println("4 Øjne = " +c);
        System.out.println("5 Øjne = " +d);
        System.out.println("6 Øjne = " +e);
        System.out.println("7 Øjne = " +f);
        System.out.println("8 Øjne = " +g);
        System.out.println("9 Øjne = " +h);
        System.out.println("10 Øjne = " +i_1);
        System.out.println("11 Øjne = " +j);
        System.out.println("12 Øjne = " +k);
        System.out.println("Ens antal øjne = " +SammeSum);
    }
    }