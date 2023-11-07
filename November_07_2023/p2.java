public class p2 {
    public static void main(String[] args) {
        System.out.println("This Program displays all the Constructor and Property of String class");
        String name="My Name is Nirman Raj";
        char ch[]={'j','a','v','a','i','s','l','o','v','e'};
        String s2=new String(ch);
        System.out.println(s2);
        System.out.println(name);
        String s1=new String(name);
        System.out.println(s1);
        //Property 1
        int length;
        System.out.println(length=s1.length());

        //Property 2
        char char1;
        char1=s1.charAt(5);
        System.out.println(char1);

        //Property 3
        String subString;
        subString=s1.substring(2,9);
        System.out.println(subString);

        //Property 4
        boolean contain;
        contain=s1.contains("Nirman");
        System.out.println(contain);

        //Property 5
        boolean equal;
        equal=s1.equals(s2);
        System.out.println(equal);

        //Constructor in String CLass
        //Constructor 1 
        String s9=new String(ch,1,2);
        System.out.println(s9);

        //Constructor 2
        String s12=new String(ch);
        System.out.println(s12);

        //Constructor 3
        String s13=new String(ch,2,5);
        System.out.println(s13);

        //Constructor 4
        String  s14=new String(s1);
        System.out.println(s14);

        //Constructor 5
        String s15=new String(ch,2,5);
        System.out.println(s15);
    }
}
