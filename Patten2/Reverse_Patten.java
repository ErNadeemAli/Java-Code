public class Reverse_Patten {
    public static void main(String[] args) {
        int n=6;
        for(int r=n; r>=1;r--){
            for(int c=1;c<=r;c++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int r=n; r>=1;r--){
            for(int c=1;c<=r;c++){
                System.out.print(c +" ");
            }
            System.out.println();
        }

        for(int r=n; r>=1;r--){
            for(int c=1;c<=r;c++){
                System.out.print(r +" ");
            }
            System.out.println();
        }

        for(int r=n; r>=1;r--){
            for(int c=1;c<=r;c++){
                System.out.print( (char)(64+r)  +" ");
            }
            System.out.println();
        }
    }
}
