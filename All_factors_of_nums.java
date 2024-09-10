
import java.util.Scanner;

public class All_factors_of_nums {
    
    public static void main(String[] args) {
        //code to accept a number from user and display all factors of that number
        // Command to create object from Scanner class
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number ");
        int num =sc.nextInt();

        System.out.println("---Factor of number----");
        //Variable num will be created
        //nextInt() Method of scanner clas will be called 
        // value returned by nextInt() method will be assigned to variable 
        System.out.println(1);
        int half= num/2;
        for (int ctr=2;ctr<=half;ctr++){
            if(num%ctr==0){
                System.out.println(ctr);
            }
        }
        System.out.println(num);

    }
}
