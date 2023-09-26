package August_22_2023;

public class Aug22_4 {
    public static void main(String[] args) {
        int numberOfOdd=0, numberOfEven=0, totalOdd=0, totalEven=0, total=0;
        for (int i=0;i<args.length;i++){
            int number = Integer.parseInt(args[i]);
            if (number%2==0)
            {
                numberOfEven++;
                totalEven += number;
            }
            else{
                numberOfOdd++;
                totalOdd += number;
            }
            total += number;
        }
        System.out.println("Number Of Odd Numbers: "+numberOfOdd);
        System.out.println("Number Of Even Numbers: "+numberOfEven);
        System.out.println("Total Of Odd Numbers: "+totalOdd);
        System.out.println("Total Of Even Numbers: "+totalEven);
        System.out.println("Total Of All Number:"+total);
    }
}


