package prog3;

public class Rectangle extends Shape{
    double length,breadth;
    public void input(double length,double breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    public void calc()
    {
        area=length*breadth;
    }
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.input(10, 20);
        r.calc();
        r.showArea();
    }
    
}
