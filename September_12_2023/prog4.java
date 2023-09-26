//Write a program to overload add method with various parameters in a class in Java. 
//Hint: (int , int), (int, float), (float, int). Method Overloading

class Calculator {
    // Method to add two integers
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    // Method to add an integer and a float
    public float add(int num1, float num2) {
        return num1 + num2;
    }

    // Method to add a float and an integer
    public float add(float num1, int num2) {
        return num1 + num2;
    }
}

public class prog4 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Add two integers
        int sum1 = calculator.add(5, 10);
        System.out.println("Sum of two integers: " + sum1);

        // Add an integer and a float
        float sum2 = calculator.add(5, 10.5f);
        System.out.println("Sum of an integer and a float: " + sum2);

        // Add a float and an integer
        float sum3 = calculator.add(5.5f, 10);
        System.out.println("Sum of a float and an integer: " + sum3);
    }
}