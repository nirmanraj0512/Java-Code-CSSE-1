package prog3;
// 3.Write a program in java to define a class Shape which has data member 	‘area’ and a 		member function showArea(). Derive two classes Circle and Rectangle from Shape 		class. Add appropriate data members and 	member functions to 	calculate and display 		the area of Circle and 	Rectangle.
public class Circle extends Shape{
    double radius;
    public void input(double radius)
    {
        this.radius=radius;
    }
    public void calc()
    {
        area=3.14*radius*radius;
    }
    public static void main(String[] args) {
        Circle c=new Circle();
        c.input(10);
        c.calc();
        c.showArea();
    }
    
    
}
