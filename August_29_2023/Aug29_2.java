import java.util.*;
public class Aug29_2 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int sum = 0, temp;
        System.out.println("Enter a Number to Check it is Palindrome or Not");
        int n = sc.nextInt();
        temp = n;
        while (n > 0) {
            int r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }
    }
}
