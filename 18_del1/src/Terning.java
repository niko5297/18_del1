public class Terning {

    // Kaster terning
    public int kast() {
        float t1 = (float) Math.random();
        float t2 = t1 * 5;
        int t3 = Math.round(t2);
        return t3 + 1;
    }
    public void kastGange(int g){
        for(int k=0; k<g; k++){
            System.out.print(kast() + " ");
        }
    }

}
