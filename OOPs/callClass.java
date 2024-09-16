
public class callClass {
    public static void main(String[] args) {
        // Point P1=new Point(200, 5000);
        // P1.ShowPoint();
        // P1.setX(3333);

        // P1.ShowPoint();

        Rectangle R1=new Rectangle(200,400);
        Circle c1=new Circle(200);

        R1.calculateArea();
        R1.calculatePerimeterLength();

        c1.calculateArea();
        c1.calculatePerimeterLength();
    }
}
