public class ArrayPractice5{
    public static void main(String[] a){
       
        int[] arr= {25,90,45,123,34}; 
        
        //Create a new array of same type and size
        //copy each value of array arr into new array without loop in reverse order 

        int[] x=new int[arr.length];
        int j=arr.length-1;
        for(int i=0; i<x.length;i++){
            x[i]=arr[j];
            j--;
        }
        System.out.println(x[0]);
        System.out.println(x[1]);

    
    }
}