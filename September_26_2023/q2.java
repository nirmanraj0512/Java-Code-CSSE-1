/*2.Write a program in java using inheritance to show how to call the base class parameterized constructors from the derived class using super. */
class BaseClass {
    int baseValue;

    // Parameterized constructor in the base class
    BaseClass(int value) {
        this.baseValue = value;
        System.out.println("Base class constructor called with value: " + value);
    }
}

class DerivedClass extends BaseClass {
    int derivedValue;

    // Parameterized constructor in the derived class
    DerivedClass(int baseValue, int derivedValue) {
        super(baseValue); // Calling the base class constructor using super
        this.derivedValue = derivedValue;
        System.out.println("Derived class constructor called with value: " + derivedValue);
    }
}

public class q2 {
    public static void main(String[] args) {
        // Create an object of the derived class
        DerivedClass derivedObj = new DerivedClass(10,20);
    }
}
