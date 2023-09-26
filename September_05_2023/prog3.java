import java.util.Scanner;
public class prog3 {
    
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of matrix");
        int n=sc.nextInt();
         int m=sc.nextInt();
        int a[][]=new int[n][m];
        System.out.println("Enter the elements of matrix");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("The matrix is");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    
}
