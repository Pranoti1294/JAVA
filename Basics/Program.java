import java.util.Scanner;
class Rectangle
{
    float length,breadth,area;


    public void setLength(float length) {
        this.length = length;
    }
    public void setBreadth(float breadth) {
        this.breadth = breadth;
    }
    public float getArea() {
        return area;
    }

    void calculateArea()
    {
        this.area=this.length*this.breadth;
    }
    void acceptRectangle()
    {

    }
    
}

class Circle{

    float radius , area ;
    public void setRadius(float radius) {
        this.radius = radius;
    }
    void calculateArea()
    {
        this.area =(float) 3.14*this.radius*this.radius;
    }
    public float getArea() {
        return area;
    }

}

public class Program {

    static Scanner sc = new Scanner(System.in);

    static int menuList()
    {

        System.out.println("0.Exit");
        System.out.println("1.Rectangle");
        System.out.println("2.Circle");
        System.err.println("Enter choice : ");
        return sc.nextInt();
    }
        
    static void acceptRectangle( Rectangle r)
    {
        System.out.println("Enter Length : ");
        r.setLength(sc.nextFloat());
        System.out.println("Enter Breadth : ");
        r.setBreadth(sc.nextFloat());
    }

    static void acceptCircle(Circle c)
    {
        System.out.println("Enter radius : ");
        c.setRadius(sc.nextInt());
    }
    public static void main(String[] args) {
        
        float length, breadth, area ;
        float radius ;
        int ch = Program .menuList();
        while (ch!=0) {

            switch (ch) {
                case 0:
                    
                    break;
                case 1:
                    Rectangle r = new Rectangle();
                    Program.acceptRectangle(r);
                    r.acceptRectangle();
                    System.out.println("Area : "+ r.getArea() );

                    break;
                case 2:
                    Circle c = new Circle();
                    Program.acceptCircle(c);
                    c.calculateArea();
                    System.out.println("Area : "+c.getArea());
                    break;
                default:
                    break;
            }
            
        }

        

    }
   
}
