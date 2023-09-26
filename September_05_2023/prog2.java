public class prog2 {
    public static void main(String args[]) {
        int a = 10, b = 20, c = 30;
        int d = a > b ? a : b;
        System.out.println("d=" + d);
        int e = a > b ? a > c ? a : c : b > c ? b : c;
        System.out.println("e=" + e);
        int f = a & b;
        System.out.println("f=" + f);
        int g = a | b;
        System.out.println("g=" + g);
        int h = a ^ b;
        System.out.println("h=" + h);
        int i = ~a;
        System.out.println("i=" + i);
        int j = a << 2;
        System.out.println("j=" + j);
        int k = a >> 2;
        System.out.println("k=" + k);
        int l = a >>> 2;
        System.out.println("l=" + l);
    }
    
}
//output:
// d=20
// e=30
// f=0
// g=30
// h=30
// i=-11
// j=40
// k=2
// l=2

