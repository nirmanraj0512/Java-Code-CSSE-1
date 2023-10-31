package prog12;
import prog10.INTER.inter1;
import prog6.*;



// WAP in java which will depict the use of Multiple Inheritance – use both extends and   	implements keyword. The class will extends from shape class as well as implements the 	Interface INTER 
public class Multiple extends shape implements inter1
    {
        int r=5;
        public void calcArea()
        {
            System.out.println("Area of circle is "+3.14*r*r);
        }
        public void disp()
        {
            System.out.println("This is the sub class");

        }
        public static void main(String[] args) {
            Multiple m=new Multiple();
            m.calcArea();
            m.disp();
        }


    
}
