import java.sql.SQLOutput;
import java.util.*;
public class Aug29_8_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Typecasting");
        byte b;
        int i=234;
        double d=234.456789;
        System.out.println("Enter Index no to convert");
        System.out.println("Enter 1 : Integer to Byte");
        System.out.println("Enter 2 : Double to Int");
        System.out.println("Enter 3 : Double to Byte");
        int num;
        num=sc.nextInt();
        switch(num){
            case 1:{
                System.out.println("Conversion of Integer to Byte");
                b=(byte)i;
                System.out.println("i and b"+i+" "+b);
                break;
            }
            case 2:{
                System.out.println("Conversion of Integer to Double");
                d=(double)i;
                System.out.println("i and d"+i+" "+d);
                break;
            }
            case 3:{
                System.out.println("Conversion of Double to Byte");
                b=(byte)d;
                System.out.println("d and b"+d+" "+b);
                break;
            }
            default:{
                System.out.println("Wrong Input");
                break;
            }

        }

    }
}
