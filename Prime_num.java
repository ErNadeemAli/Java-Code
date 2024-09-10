import java.util.Scanner;
public class Prime_num {
    public static void main(String[] args){
        //Code to accept a number from user and check whether number is prime or not
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number ");
        int num=sc.nextInt();
        int half=num/2;
        int flag=0;
        for(int ctr=2;ctr<=half;ctr++){
            if(num%ctr ==0){
                System.out.println("Number is not Prime");
                flag=1;
                break;
            }
        }
        if(flag==0){

        
        System.out.println("Number Is Prime ");
        }
    }
}
