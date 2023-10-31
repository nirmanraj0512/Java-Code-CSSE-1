package prog1;
public class Run {
  
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.input(1, 1000);
        p1.input("A", 123);
        p1.disp();
        Person p2 = new Person();
        p2.input(2, 2000);
        p2.input("B", 456);
        p2.disp();
        Person p3 = new Person();
        p3.input(3, 3000);
        p3.input("C", 789);
        p3.disp();
    } 
}
