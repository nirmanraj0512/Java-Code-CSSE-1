public class p5 {
    public static void main(String[] args) {
        System.out.println("This is A program of Nested Try and Catch");
        int e=34;
        int f=0;
        int [] num1={2,3,4,5,6,7,89,9,56};
        try{
            System.out.println(num1[23]);
            try{
                System.out.println(e/f);
            }
            catch(ArithmeticException e2){
                System.out.println("There is a Problem 111"+e2);
            }
        }
        catch(ArrayIndexOutOfBoundsException e3){
            System.out.println("There is A Problem 222"+e3);
        }
    }
}
