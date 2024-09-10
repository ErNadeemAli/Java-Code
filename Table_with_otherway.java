import java.util.Scanner;
public class Table_with_otherway {

   
    public static void main(String[] a){
        System.out.print("Enter Number: ");
        Scanner obj=new Scanner(System.in);
        
        int num=obj.nextInt();
        int res=num;
        System.out.println(num + " X " + 1 + " = "+res);
        for(int i=2;i<=10;i++){
            res=res + num;
            System.out.println(num + " X " +i+" = " +res);
        }

    }
} 