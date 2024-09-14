import java.util.Scanner;

public class day_finder {
    public static void main(String[] args) {
        String[] days={"Wednesday","Thursday","Friday","Saturday","Sunday","Monday","Tuesday"};

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any date of current Month: ");
        int date=sc.nextInt();
        if(date<1 || date>29){
            System.out.println("Invalid Date");
        }
        else{
            int i=date%7;
            System.out.println("Day is :"+days[i]);
        }
    }
}
