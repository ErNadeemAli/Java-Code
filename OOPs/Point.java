package OOPs;
public class Point {
   //Declaring instance variable
   private int a;
   private int b;

   public Point(int x,int y){
        this.a=x;
        this.b=y;
   }
   // Defining Methods
   public int getX(){
    return this.a;
   }
   public int getY(){
    return this.b;
   }
   public void setX(int x){
    this.a=x;
   }
   public void setY(int y){
    this.b=y;
   }
   public void ShowPoint(){
    System.out.println("x="+this.a);
    System.out.println("y="+this.b);
   }


}
