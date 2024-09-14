public class ArrayExample4{
    public static void main(String[] a){
        int[] x={10,232,17,19,897,57,30,29};
       // Count total even and odds in array
       int even=0;
       int odd=0;
        for(int i=0; i<x.length;i++){
            if(x[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even: "+even);
        System.out.println("Odd: "+odd);
    }
}