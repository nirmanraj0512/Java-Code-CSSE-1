//1.Write a program which will overload the area () method and display the area of a circle, triangle and square as per user choice and user entered dimensions. 
//Make it a menu driven program

import java.util.Scanner;

class GeometryCalculator {
    // Method to calculate the area of a circle
    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate the area of a triangle
    public double area(double base, double height) {
        return 0.5 * base * height;
    }

    // Method to calculate the area of a square
    public double area(double sideLength, String shape) {
        return sideLength * sideLength;
    }
}

public class prog5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GeometryCalculator calculator = new GeometryCalculator();

        while (true) {
            System.out.println("Geometry Calculator Menu:");
            System.out.println("1. Calculate Circle Area");
            System.out.println("2. Calculate Triangle Area");
            System.out.println("3. Calculate Square Area");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1/2/3/4): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the radius of the circle: ");
                    double radius = scanner.nextDouble();
                    double circleArea = calculator.area(radius);
                    System.out.println("Area of the circle: " + circleArea);
                    break;

                case 2:
                    System.out.print("Enter the base length of the triangle: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the height of the triangle: ");
                    double height = scanner.nextDouble();
                    double triangleArea = calculator.area(base, height);
                    System.out.println("Area of the triangle: " + triangleArea);
                    break;

                case 3:
                    System.out.print("Enter the side length of the square: ");
                    double sideLength = scanner.nextDouble();
                    double squareArea = calculator.area(sideLength, "square");
                    System.out.println("Area of the square: " + squareArea);
                    break;

                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }
    }
}