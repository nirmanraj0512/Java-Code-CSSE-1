package prog4;
// 4.Program on Dynamic Method Dispatch.
public class Run4 {
    public static void main(String[] args) {
        prog3.Circle c=new prog3.Circle();
        c.input(10);
        c.calc();
        c.showArea();
        prog3.Rectangle r=new prog3.Rectangle();
        r.input(10, 20);
        r.calc();
        r.showArea();
    }
    
}
