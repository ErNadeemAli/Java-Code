public class Rectangle{
    private int width;
    private int height;

    public Rectangle(int arg1,int arg2){
        this.width=arg1;
        this.height=arg2;
    }

    public void calculateArea(){
        int area=this.width*this.height;
        System.out.println("Area of rectangle is: "+area);
    }

    public void calculatePerimeterLength(){
        int perimeter=2*(this.width+this.height);
        System.out.println("Perimeter of rectangle is : "+perimeter);
    }
}