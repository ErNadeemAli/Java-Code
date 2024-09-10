package Patten1;
public class Start_Pattan {

    public static void main(String[] args) {
        int n=6;
        // To print star
        for(int r=1; r<=n;r++){
            //To print * in same row
            for(int c=1;c<=r;c++){
                System.out.print("*");
            }
            //To break line
            System.out.println();
        }
// To print number
        for(int r=1; r<=n;r++){
            //To print * in same row
            for(int c=1;c<=r;c++){
                System.out.print(c);
            }
            //To break line
            System.out.println();
        }
// To print alphabet
        for(int r=1; r<=n;r++){
            //To print * in same row
            for(int c=1;c<=r;c++){
                System.out.print((char)(64+c));
            }
            //To break line
            System.out.println();
        }

        for(int r=1; r<=n;r++){
            //To print * in same row
            for(int c=1;c<=r;c++){
                System.out.print((char)(64+r));
            }
            //To break line
            System.out.println();
        }
    }

    
}