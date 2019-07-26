import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) 
        arr[i]=s.nextInt();
        for(int i=0;i<n/2;) {
            for(int j=n-1;j>=n/2;) {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    }
}