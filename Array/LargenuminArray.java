public class LargenuminArray{
    public static void main(String[] args) {
        int[] arr={123,4656,23,456,203,464,2342,1,156};
        //Write code to find largest number

        int m=arr[0]; // we can consider first number  is largest number then check next number
        for(int i=1;i<arr.length;i++){
            if(arr[i]>m){
                m=arr[i];
            }
        }
        System.out.println(m);
    }
}