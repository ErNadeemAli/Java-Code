public class ArrayExample2{
    public static void main(String[] a){
        int[] x={10,232,17,19,897,57,3,29};
        //Display those numbers that are even
        for(int i=0; i<x.length;i++){
            if(x[i]%2==0){
                System.out.println(x[i]);
            }
       }
    }
}