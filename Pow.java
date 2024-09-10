public class Pow {
    public static void main(String[] args) {

        // Code to evaluate x power y
        int x=2,y=8;
        int p=x;
        for(int c=1;c<y;c++){
            p=p*x;
        }
        System.out.println(p);
    }
}
