package prog6;

public class Circle extends shape{
    int r;
    public void input(int r)
    {
        this.r=r;
    }
    public void calcArea()
    {
        System.out.println("Area of circle is "+3.14*r*r);
    }
    
}
