//1.	A Plastic manufacturer sells plastic in different shapes like 2D sheet and 3D box.
//The cost of sheet is Rs 40/ per square ft. and the cost of box is Rs 60/ per cubic ft. 
//Implement it in Java to calculate the cost of plastic as per the dimensions given by the user where 3D inherits from 2D. Single Inheritance

import java.util.Scanner;

// 2D Sheet class
class Sheet {
    protected double area;  // Square feet

    // Constructor to initialize area
    public Sheet(double area) {
        this.area = area;
    }

    // Method to calculate the cost of sheet
    public double calculateCost() {
        return area * 40;  // Rs. 40 per square ft.
    }
}

// 3D Box class inheriting from Sheet
class Box extends Sheet {
    private double height;  // Feet

    // Constructor to initialize area and height
    public Box(double area, double height) {
        super(area);
        this.height = height;
    }

    // Method to calculate the cost of box
    @Override
    public double calculateCost() {
        double volume = area * height;  // Cubic ft.
        return volume * 60;  // Rs. 60 per cubic ft.
    }
}

public class prog6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the area (in square feet): ");
        double area = scanner.nextDouble();

        System.out.print("Enter the height (in feet, for the box): ");
        double height = scanner.nextDouble();

        Sheet sheet = new Sheet(area);
        Box box = new Box(area, height);

        System.out.println("Cost of Sheet: Rs. " + sheet.calculateCost());
        System.out.println("Cost of Box: Rs. " + box.calculateCost());

        scanner.close();
    }
}