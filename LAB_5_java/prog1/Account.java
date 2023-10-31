// 1.Write a class Account containing acc_no, balance as data members and two 	methods as input() for taking input from user and disp() method to display the details. Create a subclass Person which has name and aadhar_no as extra 	data members 	and override disp() function. Write the complete progrm to take and print details 	of three persons.
package prog1;
public class Account {
    int acc_no;
    double balance;
   public  void input(int acc_no,double balance)
    {
        this.acc_no=acc_no;
        this.balance=balance;
    }
    public void disp()
    {
        System.out.println("Account number is "+acc_no);
        System.out.println("Balance is "+balance);
    }
}