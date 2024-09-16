public class Non_static{
    private int num;
    public Non_static(int x){
        this.num=x;
    }
    // non-static method
    public void showdata(){
        int sq=this.num*this.num;
        System.out.println(sq);
    }
    // static method
    public static void showdata(int n){
        int sq=n*n;
        System.out.println(sq);
    }

}