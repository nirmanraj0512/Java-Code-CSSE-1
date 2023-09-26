import java.util.*;
public class Aug29_9
    {
        public void sort(int arr[]){
            int l = arr.length;
            for (int i=0;i<l;i++){
                for (int j=i;j<l-1;j++){
                    if (arr[j]>arr[j+1]){
                        int t=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=t;
                    }
                }
            }
            System.out.println("Sorted Array: ");
            for (int i=0;i<l;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            Aug29_9  obj = new Aug29_9  ();
            System.out.println("Enter the number of elements you want to sort: ");
            int n=sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter "+n+" Elements: ");
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            obj.sort(arr);
        }}


