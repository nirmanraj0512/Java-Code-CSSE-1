package August_22_2023;

import java.util.Scanner;
public class Aug22_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number");
        int number1 = sc.nextInt();
        System.out.println("Enter Another Number");
        int number2 = sc.nextInt();
        System.out.println("Enter Another Number");
        int number3 = sc.nextInt();

        if (number1 >= number2 && number1>=number3){
            System.out.println(number1+" is Largest");
        }
        else if(number2 >= number1 && number2>=number3){
            System.out.println(number2+" is Largest");
        }
        else{
            System.out.println(number3+" is Largest");
        }
        if(number1==number2){
            if (number2==number3){
                System.out.println("All Are Equal");
            }
            else
                System.out.println("First & Second are Equal!");
        }
        else if (number2==number3)
            System.out.println("Second & Third are Equal!");
        else if (number1==number3)
            System.out.println("First & Third are Equal!");
        else
            System.out.println("All are Unequal");
    }
}
