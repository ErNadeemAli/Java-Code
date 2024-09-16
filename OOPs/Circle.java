public class Circle{
    private int radius;
    
    public Circle(int arg){
this.radius=arg;
    }

    public void calculateArea(){
        double area=3.14*this.radius*radius;
        System.out.println("Area of Circle is : "+area);
    }

    public void calculatePerimeterLength(){
        double perimeter=2*3.14*this.radius;
        System.out.println("Periemeter of circle is "+perimeter);
    }

}