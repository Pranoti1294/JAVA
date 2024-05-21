
class shape
{
    float area;
    public void setArea(float area) {
        this.area = area;
    }
    public float getArea() {
        return this.area;
    }
    void print()
    {
       System.out.println(" Area is : "+this.area); 
    }

}

class Traingle extends shape 
{
    float base,radius;
    public Traingle(float base , float radius)
    {
        this.radius=radius;
        this.base=base;
    }
    public float getBase() {
        return base;
    }
    public float getRadius() {
        return radius;
    }

}
class Circle extends shape
{

    float radius;
    
    public Circle(float radius)
    {
        this.radius=radius;

    } 
    public float getRadius() {
        return radius;
    }
    

}
class Rectangle extends shape
{

    float length,breadth;
    public Rectangle(int length, int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    
    public float getBreadth() {
        return breadth;
    }
    public float getLength() {
        return length;
    }


}

public class Inheritance_basic {
    static void calculateArea(shape o)
    {
        float area;
        if(o instanceof Traingle)
        {
            Traingle t =(Traingle) o;
            area = (float)(0.5)*t.getBase()*t.getRadius();
            t.setArea(area);
            t.print();
        }
        else if(o instanceof Circle)
        {
            Circle c = (Circle) o;
            area =(float) 314*c.getRadius()*c.getRadius();
            c.setArea(area);
            c.print();
        }
        else
        {
            Rectangle r = (Rectangle) o;
            area=r.getLength()*r.getBreadth();
            r.setArea(area);
            r.print();
        }
    }

    public static void main(String[] args) {
        shape s=null;
        s= new Traingle(2,  3);
        Inheritance_basic.calculateArea(s);
        s = new Circle(3);
        Inheritance_basic.calculateArea(s);
        s= new Rectangle(2,3);      
        Inheritance_basic.calculateArea(s);

    }
}
