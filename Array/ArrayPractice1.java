public class ArrayPractice1{
    public static void main(String[] a){
        int[] arr=new int[5];
        // Write command to assign following value
        //25 at index 0
        //90 at index 1
        //45 at index 2
        //123 at index 3
        //34 at index 4 

        arr[0]=25;
        arr[1]=90;
        arr[2]=45;
        arr[3]=123;
        arr[4]=34;

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    
    }
}