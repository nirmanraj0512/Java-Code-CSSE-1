import java.io.*;
class prog1
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the roll no");
        int roll=Integer.parseInt(br.readLine());
        System.out.println("Enter the name");
        String name=br.readLine();
        System.out.println("Enter the marks of 4 subjects");
        int m1=Integer.parseInt(br.readLine());
        int m2=Integer.parseInt(br.readLine());
        int m3=Integer.parseInt(br.readLine());
        int m4=Integer.parseInt(br.readLine());
        accept(roll,name,m1,m2,m3,m4);
        display(roll,name,m1,m2,m3,m4);
    }
    static void accept(int roll,String name,int m1,int m2,int m3,int m4)
    {
        System.out.println("Roll no="+roll);
        System.out.println("Name="+name);
        System.out.println("Marks of 4 subjects="+m1+" "+m2+" "+m3+" "+m4);
    }
    static void display(int roll,String name,int m1,int m2,int m3,int m4)//function for displaying 
    {
        System.out.println("Roll no="+roll);
        System.out.println("Name="+name);
        System.out.println("Marks of 4 subjects="+m1+" "+m2+" "+m3+" "+m4);
        int sum=m1+m2+m3+m4;
        switch(sum)
        {
        }

    }
}