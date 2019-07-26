import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=s.nextInt();
        }
        int profit=0,temp=0;
        for(int i=0;i<n-2;i++) {
            for(int j=i+1;j<n;j++) {
                 temp=arr[j]-arr[i];
                if(temp>profit)
                profit=temp;
            }
        }
    System.out.println(profit);
}
}
