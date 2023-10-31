package prog2;

public class p1 extends prog1.Account
{
        

    public p1(int acc_no,double balance)
    {
        super.input(acc_no,balance);
    }
    public static void main(String[] args) {
        p1 p=new p1(123, 1000);
        p.disp();
    }    
 }    


