class p1{
    public static void main(String[] args) {
        int a=100;
        int b=0;
        System.out.println("This is A Example of Arithematic Exception");
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println("Some Problem."+e);
        }
    }
}