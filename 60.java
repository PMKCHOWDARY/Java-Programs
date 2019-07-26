import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) 
        arr[i]=s.nextInt();
        int i=0,j=n-1;
        for(;i<j;) {
            if(arr[i]==0 && arr[j]==1) {
                i++;
                j--;
            } else if(arr[i]==1 && arr[j]==0) {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            } else if(arr[i]==0 && arr[j]==0) {
                i++;
            } else if(arr[i]==1 && arr[j]==1) {
                j--;
            }
        }
        for(int k=0;k<n;k++)
        System.out.print(arr[k]+" ");
    }
}