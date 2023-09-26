//3. Write a program in java using constructor overloading concept to calculate the area of a rectangle having data member as length and breadth. 
// Use default constructor to initialize the value of the data member to zero and parameterized constructor to initialize the value of data member according to the user input. 

import java.util.Scanner;

class Rectangle {
    private double length;
    private double breadth;

    // Default constructor to initialize the values to zero
    public Rectangle() {
        length = 5.0;
        breadth = 5.0;
    }

    // Parameterized constructor to initialize the values based on user input
    public Rectangle(double len, double brd) {
        length = len;
        breadth = brd;
    }

    // Method to calculate the area of the rectangle                                     \=
    public double calculateArea() {
        return length * breadth;
    }
}

public class prog3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a Rectangle object with default values
        Rectangle rectangle1 = new Rectangle();

        System.out.print("Enter the length of the rectangle: ");
        double len = scanner.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double brd = scanner.nextDouble();

        // Create a Rectangle object with user-input values
        Rectangle rectangle2 = new Rectangle(len, brd);

        // Calculate and display the area for both rectangles
        double area1 = rectangle1.calculateArea();
        double area2 = rectangle2.calculateArea();

        System.out.println("Area of Rectangle 1 (default values): " + area1);
        System.out.println("Area of Rectangle 2 (user input values): " + area2);

        scanner.close();
    }
}