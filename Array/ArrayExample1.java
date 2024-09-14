public class ArrayExample1{
    public static void main(String[] a){
        int[] x={10,232,17,19,897,57,3,29};
        //Display those numbers that contains only 2 digits
        for(int i=0; i<x.length;i++){
            if(x[i]>10 && x[i]<=99){
                System.out.println(x[i]);
            }
       }
    }
}