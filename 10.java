import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        /*int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=s.nextInt();
        }*/
        int[] arr={16,17,3,4,5,2};
        int n=arr.length;
        for(int i=0;i<n-1;i++) {
          int temp=0;
            for(int j=i+1;j<n;j++) {
                    if(arr[j]>temp)
                    temp=arr[j];
                }
            arr[i]=temp;
        }
        arr[n-1]=-1;
        for(int i=0;i<n;i++)
        System.out.print(arr[i]);
    }
}