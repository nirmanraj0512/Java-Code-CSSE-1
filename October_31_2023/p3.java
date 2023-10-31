public class p3 {
    public static void main(String[] args) {
        System.out.println("This Program is for multiple Catch");
        int a=100;
        int b=0;
        System.out.println("This is A Example of Arithematic Exception");
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println("Some Problem 000"+e);
        }
        catch(ArrayIndexOutOfBoundsException e1){
            System.out.println("Some Problem 111"+e1);
        }
        catch(SecurityException e2){
            System.out.println("Some Problem 222"+e2);
        }
        catch(Exception e3){
            System.out.println("Some Problem 333"+e3);
        }
    }
}
