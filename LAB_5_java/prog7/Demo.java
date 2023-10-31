package prog7;
// 7.Do the program number 6 but in Demo class create the reference object of shape class, 		initialize that object with Circle and Rectangle class and call the 	methods.
public class Demo {
    public static void main(String[] args) {
        prog6.shape s;
        prog6.Circle c=new prog6.Circle();
        c.input(10);
        s=c;
        s.calcArea();
        prog6.Rectangle r=new prog6.Rectangle();
        r.input(10, 20);
        s=r;
        s.calcArea();
    }
    
}
