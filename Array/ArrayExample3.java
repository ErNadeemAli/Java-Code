public class ArrayExample3{
    public static void main(String[] a){
        int[] x={10,232,17,19,897,57,30,29};
        //Display those numbers that are even and nultiple of 5
        for(int i=0; i<x.length;i++){
            // if(x[i]%2==0 && x[i]%5==0)
            if(x[i]%10==0)
            {
                System.out.println(x[i]);
            }
       }
    }
}