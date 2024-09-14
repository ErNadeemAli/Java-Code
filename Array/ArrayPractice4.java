public class ArrayPractice4{
    public static void main(String[] a){
       
        int[] arr= {25,90,45,123,34}; 
        
        // Create a new array of same type and same size
        //  copy each value of array x into new array index wise without loop

        int[] x=new int[arr.length];
        System.out.println(x[2]);

        x[0]=arr[0];
        x[1]=arr[1];
        x[2]=arr[2];
        x[3]=arr[3];
        x[4]=arr[4];

        for(int i=0; i<x.length;i++){
            System.out.println(x[i]);
        }

    
    }
}