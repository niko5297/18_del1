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

    }
}
  /*  @Test
    public void rollMultiple() {
        int a=0,b=0,c=0,d=0,e=0,f=0;
        for (int i=0; i<60000; i++){
            int tal = D.roll();
            if (tal==1){
                a++;
            }
            if (tal==2){
                b++;
            }
            if (tal==3){
                c++;
            }
            if (tal==4){
                d++;
            }
            if (tal==5){
                e++;
            }
            if (tal==6){
                f++;
            }
        }
        System.out.println("a = " +a);
        System.out.println("b = " +b);
        System.out.println("c = " +c);
        System.out.println("d = " +d);
        System.out.println("e = " +e);
        System.out.println("f = " +f);
        assertTrue(a<9600 && a>10400);
        assertTrue(b<9600 && b>10400);
        assertTrue(c<9600 && c>10400);
        assertTrue(d<9600 && d>10400);
        assertTrue(e<9600 && e>10400);
        assertTrue(f<9600 && f>10400);
    }
*/