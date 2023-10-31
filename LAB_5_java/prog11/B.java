package prog11;
// Create two interface A and B. Interface A will have two methods called math1() and 		math2() and interface B which will be a child of interface A and having methods called 		meth3().

public class B {
    public interface inter2 extends A.inter1
    {
        void meth3();
    }
    
}
