
public class Number_halffull_pramid {
    public static void main(String[] args){
        int n=6;
        for(int r=1;r<=n;r++){
            // this is use to space
            for(int s=n-r;s>=1;s--){
                System.out.print(" ");
            }
            // this is print the star
            for(int c=1;c<=r;c++){
                System.out.print(c);
            }
            // this is use to print start opposite those star
            for(int c=r-1;c>=1;c--){
                System.out.print(c);
            }


            // this command to use line break
            System.out.println();


        }
    }
}
