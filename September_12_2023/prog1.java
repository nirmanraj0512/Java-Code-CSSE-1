//1.	Write a class file – box with three data members(length, width, height) and a method volume() . 
//Also implement the application class Demo where an object of 	the box class is created with user entered dimensions and volume is printed.

import java.util.Scanner;

class Box {
    private double length;
    private double width;
    private double height;

    // Constructor to initialize the dimensions of the box
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Method to calculate the volume of the box
    public double volume() {
        return length * width * height;
    }
}

public class prog1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter dimensions
        System.out.print("Enter the length of the box: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the box: ");
        double width = scanner.nextDouble();

        System.out.print("Enter the height of the box: ");
        double height = scanner.nextDouble();

        // Create a Box object with user-entered dimensions
        Box myBox = new Box(length, width, height);

        // Calculate and print the volume of the box
        double volume = myBox.volume();
        System.out.println("The volume of the box is: " + volume);

        scanner.close();
    }
}