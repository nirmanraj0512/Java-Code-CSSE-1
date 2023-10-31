import java.util.*;

public class diagonal
            {
                public static void main(String[] args) 
                {
                    Scanner sc = new Scanner(System.in);
                    int[][] a = new int[3][3];
                    int i,j,sum1=0,sum2=0;
                    System.out.println("Enter the elements of the matrix");
                    for(i=0;i<3;i++)
                    {
                        for(j=0;j<3;j++)
                        {
                            a[i][j] = sc.nextInt();
                        }
                    }
                    for(i=0;i<3;i++)
                    {
                        for(j=0;j<3;j++)
                        {
                            if(i==j)
                            {
                                sum1 = sum1 + a[i][j];
                            }
                            if(i+j==2)
                            {
                                sum2 = sum2 + a[i][j];
                            }
                        }
                    }
                    System.out.println("Sum of left diagonal elements is "+sum1);
                    System.out.println("Sum of right diagonal elements is "+sum2);

                    
               }
}