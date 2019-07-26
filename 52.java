import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=s.nextInt();
        int miss=((n+1)*(n+2))/2;
      
        for(int i=0;i<n;i++) {
            miss-=arr[i];
        }
        if(miss==0 || n==arr[n-1])
        System.out.println("-1");
        else
        System.out.println(miss);
    }
}