public class p6 {
    public static void main(String[] args) {
        System.out.println("This is A NULL Pointer Exception");
        int  arr4[]=null;
        try{
            System.out.println(arr4[3]);
        }
        catch(NullPointerException e5){
            System.out.println("There is a Problem "+e5);
        }


    }
}
