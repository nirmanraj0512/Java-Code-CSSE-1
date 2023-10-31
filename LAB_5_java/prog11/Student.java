package prog11;
// Create a class called student who will implements B and override all the 	function. Check the error by only implementing interface B methods
public class Student {
    public static void main(String[] args) {
        B.inter2 i=new B.inter2() {
           
            public void meth3() {
                System.out.println("Hello");
            }

           
            public void math1() {
                System.out.println("Hello");
            }

          
            public void math2() {
                System.out.println("Hello");
            }
        };
        i.meth3();
        i.math1();
        i.math2();
    }
    
}
