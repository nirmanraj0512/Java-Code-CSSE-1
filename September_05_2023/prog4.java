public class prog4 {
   
    public static void main(String args[]) {
        CustomerDetails c[]=new CustomerDetails[3];
        for(int i=0;i<3;i++)
        {
            c[i]=new CustomerDetails();
            c[i].accept();
        }
        for(int i=0;i<3;i++)
        {
            c[i].display();
        }
    }
}
