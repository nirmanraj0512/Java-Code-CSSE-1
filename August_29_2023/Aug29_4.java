
import java.io.*;
public class Aug29_4 {
    public static void main(String[] args)throws IOException {

        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        int n, countOdd=0, countEven=0,sumOdd=0, sumEven=0,sum =0;
        System.out.println("Enter the value of N: ");
        n = Integer.parseInt(br.readLine());
        for(int i=1;i<=n;i++){
            System.out.println("Enter Number "+i);
            int number = Integer.parseInt(br.readLine());

            if (number%2==0){
                sumEven += number;
                countEven++;
            }
            else{
                sumOdd += number;
                countOdd++;
            }
            sum += number;
        }
        System.out.println("No. Of Odd Numbers: "+countOdd);
        System.out.println("No. Of Even Numbers: "+countEven);
        System.out.println("Sum Of Odd Numbers: "+sumOdd);
        System.out.println("Sum Of Even Numbers: "+sumEven);
        System.out.println("Sum Of All Numbers: "+sum);


    }
}
