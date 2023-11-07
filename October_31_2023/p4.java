public class p4 {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5,6};
        System.out.println("This is Finally Block Program");
        try{
            System.out.println(num[10]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Some Problem is there"+e);
        }
        finally{
            System.out.println("This is A Finally Block");
        }
    }
    
}
