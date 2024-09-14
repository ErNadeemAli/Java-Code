public class ArrayPractice3{
    public static void main(String[] a){
       
        int[] arr=new int[] {25,90,45,123,34}; 
        // Write command to increase value of each element by 5
        arr[0] +=5;
        arr[1] +=5;
        arr[2] +=5;
        arr[3] +=5;
        arr[4] +=5;

        for(int i=0;i<arr.length; i++){
            System.out.println(arr[i]);
        }

        // with loop

        for(int i=0; i<arr.length;i++ ){
            arr[i]+=5;
            System.out.println(arr[i]);
        }

    
    }
}