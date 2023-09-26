//2.Write a program in Java to create a class Rectangle having data members length and breadth and three methods called read, 
//calculate and display to read the values of length and breadth,calculate the area and perimeter of the rectangle and display the result respectively.

import java.util.Scanner;

class Rectangle {
    private double length;
    private double breadth;

    // Method to read the values of length and breadth
    public void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        length = sc.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        breadth = sc.nextDouble();
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return length * breadth;
    }

    // Method to calculate the perimeter of the rectangle
    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }

    // Method to display the results
    public void display() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}

public class prog2 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        // Read values for length and breadth
        rectangle.read();

        // Calculate and display area and perimeter
        rectangle.display();
    }
}