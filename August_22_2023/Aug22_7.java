package August_22_2023;

import java.util.Scanner;
public class Aug22_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int math,science,hindi;
        System.out.println("Enter Maths Marks");
        math=sc.nextInt();
        System.out.println("Enter Science Marks");
        science=sc.nextInt();
        System.out.println("Enter Hindi Marks");
        hindi=sc.nextInt();
        float total=math+science+hindi;
        float per=total/300;
        float percentage=per*100;
        System.out.println("Your Grade in Math ");
        if(math>90){
            System.out.println("Grade A");
        }
        else if(math>70){
            System.out.println("Grade B");
        }
        else if(math>50){
            System.out.println("Grade C");
        }
        else if(math>33){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Fail");
        }
        System.out.println("Your Grade in Science  ");
        if(science>90){
            System.out.println("Grade A");
        }
        else if(science>70){
            System.out.println("Grade B");
        }
        else if(science>50){
            System.out.println("Grade C");
        }
        else if(science>33){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Fail");
        }
        System.out.println("Your Grade in Hindi  ");
        if(hindi>90){
            System.out.println("Grade A");
        }
        else if(hindi>70){
            System.out.println("Grade B");
        }
        else if(hindi>50){
            System.out.println("Grade C");
        }
        else if(hindi>33){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Fail");
        }
        System.out.printf("Your total marks is %.2f.\n",total );
        System.out.printf("Your Percentage is %.2f.\n",percentage );
        System.out.println("Your Overall Grade is  ");
        if(percentage>90){
            System.out.println("Grade A");
        }
        else if(percentage>70){
            System.out.println("Grade B");
        }
        else if(percentage>50){
            System.out.println("Grade C");
        }
        else if(percentage>33){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Fail");
        }
        if(math>science){
            if(math>hindi){
                System.out.println("The highest Marks is in Mathematics is "+math);
            }
            else{
                System.out.println("The highest Marks is in Hindi is "+hindi);
            }
        }
        else if(science>math){
            if(science>hindi){
                System.out.println("The highest Marks is in Science is "+science);
            }
            else{
                System.out.println("The Highest Marks is in Hindi "+hindi);
            }
        }
        else if(hindi>math){
            if(hindi>science){
                System.out.println("The Highest Marks is in Hindi "+hindi);
            }
            else{
                System.out.println("The Highest Marks is in Science "+science);
            }
        }


    }
}
