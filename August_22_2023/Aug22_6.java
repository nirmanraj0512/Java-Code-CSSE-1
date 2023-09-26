package August_22_2023;

import java.util.*;
public class Aug22_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter First Number");
        a=sc.nextInt();
        System.out.println("Enter Second Number");
        b=sc.nextInt();
        System.out.println("Enter 1 for Addition");
        System.out.println("Enter 2 for Subtraction");
        System.out.println("Enter 3 for Multiplication");
        System.out.println("Enter 4 for Division");
        System.out.println("Enter the Operator Number you want to use.");
        int num=sc.nextInt();
        switch(num){
            case 1:{
                int sum=a+b;
                System.out.printf("The Addition of %d and %d is %d",a,b,sum);
                break;
            }
            case 2:{
                if(a>b){
                int sub=a-b;
                System.out.printf("The Subtraction of %d and %d is %d",a,b,sub);
            }
                else{
                    int sub=a-b;
                    System.out.printf("You will get Negative Number and the Subtraction of %d and %d is %d",a,b,sub);
                }
                }
                break;
            case 3:{
                int mul=a*b;
                System.out.printf("The Subtraction of %d and %d is %d",a,b,mul);
                break;
            }
            case 4:{
                if(a>b){

                    if(a==0){
                        System.out.println("No Result Invalid Entry");
                    }
                    else{
                    int div=a/b;
                    System.out.printf("The Divison of %d and  %d is %d",a,b,div);
                    }
                }
                else{
                    if(b==0){
                        System.out.println("No Result Invalid Entry");
                    }
                    else{
                    int div=b/a;
                    System.out.printf("The Divison of %d and  %d is %d",b,a,div);
                    }
                }
                break;

            }
        }
    }
}
