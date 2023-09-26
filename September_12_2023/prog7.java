//2.Sequence of constructor invocation in case of multi level inheritance. Illustrate the 	execution of constructors in multi-level inheritance with 
//three Java classes – plate(length, width), box(length, width, height), wood box (length, width, height, thick) where box inherits from plate and woodbox inherits from box class. 
//Each class has constructor where dimensions are taken from user. 

import java.util.Scanner;

class Plate {
    private double length;
    private double width;

    public Plate() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of plate: ");
        length = sc.nextDouble();
        System.out.print("Enter width of plate: ");
        width = sc.nextDouble();
    }

    public void displayPlateInfo() {
        System.out.println("Plate - Length: " + length + ", Width: " + width);
    }
}

class Box extends Plate {
    private double height;

    public Box() {
        super(); // Calls the Plate constructor
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter height of box: ");
        height = sc.nextDouble();
    }

    public void displayBoxInfo() {
        displayPlateInfo(); // Calls the Plate class method
        System.out.println("Box - Height: " + height);
    }
}

class WoodBox extends Box {
    private double thickness;

    public WoodBox() {
        super(); // Calls the Box constructor, which calls the Plate constructor
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter thickness of wood box: ");
        thickness = sc.nextDouble();
    }

    public void displayWoodBoxInfo() {
        displayBoxInfo(); // Calls the Box class method, which in turn calls the Plate class method
        System.out.println("Wood Box - Thickness: " + thickness);
    }
}

public class prog7 {
    public static void main(String[] args) {
        WoodBox woodBox = new WoodBox();
        woodBox.displayWoodBoxInfo();
    }
}