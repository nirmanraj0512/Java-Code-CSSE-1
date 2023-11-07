import java.util.Scanner;
public class p3 {
    public static void main(String[] args) {
        String name="Nirman";
        String s1=new String(name);
        
        // Property 1
        StringBuffer s2=new StringBuffer(s1);
        System.out.println("string buffer s2 is "+s2);
        s2.append("Hi");
        System.out.println("String after appending \"hi\" is "+s2);
        // Property 2 
        s2.insert(3,"hello");
        System.out.println("string  after inserting \"hello\" at index 3 is "+s2);
        // Property 3 
        s2.replace(2,5,"hello");
        System.out.println("string buffer s2 after replacing \"hello\" from index 2 to 5 is "+s2);
        // Property 4 
        s2.delete(2,5);
        System.out.println("string buffer s2 after deleting from index 2 to 5 is "+s2);
        // Property 5 
        s2.reverse();
        System.out.println("string buffer s2 after reversing is "+s2);

        // constructor of string buffer
        // 1 StringBuffer()
        StringBuffer s3=new StringBuffer();
        System.out.println("string buffer s3 is "+s3);
        // 2 StringBuffer(int capacity)
        StringBuffer s4=new StringBuffer(50);
        System.out.println("string buffer s4 is "+s4);
        // 3 StringBuffer(String s)
        StringBuffer s5=new StringBuffer("hello");
        System.out.println("string buffer s5 is "+s5);
        // 4 StringBuffer(CharSequence s)
        StringBuffer s6=new StringBuffer("hello");
        System.out.println("string buffer s6 is "+s6);
    }
}
