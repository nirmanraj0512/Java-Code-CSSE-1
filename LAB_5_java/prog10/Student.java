package prog10;
// Create a  class student who will 	implement  the interface INTER-1 and override the disp() method. The class have their 	own methods called nonIfaceMethod() also. Create the object of the class and call both 	the methods. Also create a reference object of the interface and allocate memory to the 	class type. And then try to call both the methods. Also display the error
public class Student {
    public static void main(String[] args) {
        INTER.inter1 i=new INTER.inter1() {
            @Override
            public void disp() {
                System.out.println("Hello");
            }
        };
        i.disp();
        Student s=new Student();
        s.nonIfaceMethod();
    }
    public void nonIfaceMethod()
    {
        System.out.println("Non interface method");
    }

    
}
