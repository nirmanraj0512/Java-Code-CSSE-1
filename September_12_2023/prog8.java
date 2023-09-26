//3.Write a program in Java having three classes Apple, Banana and Cherry. Class Banana and Cherry are inherited from class Apple and each class have their own member function show().
//Using Dynamic Method Dispatch concept display all the show() 	method of each class. 


class Apple {
    public void show() {
        System.out.println("This is  Apple class.");
    }
}

class Banana extends Apple {
    @Override
    public void show() {
        System.out.println("This is Banana class.");
    }
}

class Cherry extends Apple {
    @Override
    public void show() {
        System.out.println("This is  Cherry class.");
    }
}

public class prog8 {
    public static void main(String[] args) {
        Apple fruit1 = new Apple();
        Apple fruit2 = new Banana();
        Apple fruit3 = new Cherry();

        fruit1.show(); // Calls the show() method of Apple
        fruit2.show(); // Calls the show() method of Banana
        fruit3.show(); // Calls the show() method of Cherry
    }
}