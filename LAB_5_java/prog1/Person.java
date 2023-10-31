package prog1;
// 1.Write a class Account containing acc_no, balance as data members and two 	methods as input() for taking input from user and disp() method to display the details. 	Create a subclass Person which has name and aadhar_no as extra 	data members 	and override disp() function. Write the complete progrm to take and print details 	of three persons.
public class Person extends Account {
    
    String name;
    int aadhar_no;
    public void input(String name,int aadhar_no)
    {
        this.name=name;
        this.aadhar_no=aadhar_no;
    }
    public void disp()
    {
        System.out.println("Name is "+name);
        System.out.println("Aadhar number is "+aadhar_no);
    }
}
