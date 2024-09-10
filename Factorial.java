public class Factorial {
    public static void main(String[] args){
        // Code to find factorial of num
        int num=4;
        for(int ctr=num-1; ctr>=2;ctr--){
            num=num*ctr;
        }
        System.out.println(num);
    }
}
