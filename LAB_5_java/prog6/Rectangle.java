package prog6;
import java.util.Scanner;
// 6.Create an Abstract class shape with an abstract method calcArea(). Derive two classes 	Circle and Rectangle and override the display area methods. Create another class 	class Demo which will create the object of Circle and rectangle class and call the 		calcArea() methods.
public class Rectangle extends shape{
    int l,b;
    public void input(int l,int b)
    {
        this.l=l;
        this.b=b;
    }
    public void calcArea()
    {

        System.out.println("Area of rectangle is "+l*b);
    }
}