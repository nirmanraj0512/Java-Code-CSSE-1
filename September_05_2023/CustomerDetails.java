import java.util.Scanner;
public class CustomerDetails implements go {
    public int CustID;
    public String CustName;
    public int CustAge;
    @Override
    public void accept()
    {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the CustID");
            CustID=sc.nextInt();
            System.out.println("Enter the CustName");
            CustName=sc.next();
            System.out.println("Enter the CustAge");
            CustAge=sc.nextInt();
        }
    }
    
    public void display()
    {
        System.out.println("CustID="+CustID);
        System.out.println("CustName="+CustName);
        System.out.println("CustAge="+CustAge);
    }


}