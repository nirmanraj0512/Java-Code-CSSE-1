public class prog8 {
    
    static int a=10;
    static int b;
    static
    {
        System.out.println("Static block is invoked");
        b=a*4;
    }
    public static void main(String args[]) {
        System.out.println("The value of a is "+a);
        System.out.println("The value of b is "+b);
    }
    
    
}
