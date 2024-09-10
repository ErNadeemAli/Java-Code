
public class halffull_pramid {
    public static void main(String[] args){
        int n=6;
        for(int r=1;r<=n;r++){
            for(int s=n-r;s>=1;s--){
                System.out.print(" ");
            }
            for(int c=1;c<=r; c++){
                System.out.print(c);
            }
            for(int c=r-1;c>=1;c--){

                System.out.print(c);
            }
            System.out.println();
        }
    }
}


//OutPut:-
//------------------
//      1
//     121
//    12321
//   1234321
//  123454321
// 12345654321  