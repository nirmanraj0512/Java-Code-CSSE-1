package prog8;

// 8.Use of super keyword in method overriding. 
public class Demo extends Spr {
   
//This is subclass and use super keyword to call the method of super class
    public void display()
    {
        super.display();
        System.out.println("This is the sub class");
    }
    public static void main(String[] args) {
        Demo d=new Demo();
        d.display();
    }
}
