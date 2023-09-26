import java.util.*;
public class Aug29_6 {
    public static void main(String[] args) {
        int [] array={2,3,5,6,7,8,9,10};
        int num=4;
        boolean isInArray=false;
        for(int element:array){
            if(num==element){
                isInArray=true;
                break;
            }}
            if(isInArray){
                System.out.printf("The element %d is present in Array.",num);
            }
            else{
                System.out.printf("The element %d is not present in Array.",num);
            }
    }



}
