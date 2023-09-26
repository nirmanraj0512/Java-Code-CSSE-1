/*1.Write a class Account containing acc_no, balance as data members and two 	methods as input() for taking input from user and disp() method to display the details. 	Create a subclass Person which has name and aadhar_no as extra 	data members 	and override disp() function. Write the complete progrm to take and print details 	of three persons. */
import java.util.*;

class Account{
    int account_number,balance;

    public void  input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Account Number");
        account_number=sc.nextInt();
        System.out.println("Enter Your Current Balance");
        balance=sc.nextInt();
    }
    public void display(){
        System.out.println("The Acoount Number is "+account_number);
        System.out.println("The Current Balance is "+balance);
    }
}

class Person extends Account{
    String Name;
    int Aadhar_no,Age;

    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name\t");
        Name=sc.nextLine();
        System.out.println("Enter The Account Number\t");
        account_number=sc.nextInt();
        System.out.println("Enter Your Current Balance\t");
        balance=sc.nextInt();
        System.out.println("Enter Your Aadhar Number\t");
        Aadhar_no=sc.nextInt();
    }
    public void display(){
        System.out.println("Your Name is "+Name);
        System.out.println("Your Age is "+Age);
         System.out.println("Your Aadhar Number is "+Aadhar_no);
        System.out.println("Your Account Number is "+account_number);
        System.out.println("Your Balance is "+balance);
    }
   
    
}

public class q1 {
    public static void main(String[] args) {
        Person per1=new Person();
        Person per2=new Person();
        Person per3=new Person();
        per1.input();
        per2.input();
        per3.input();
        per1.display();
        per2.display();
        per3.display();
        
    }
}
