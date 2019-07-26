import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=s.nextInt();
        }
        int count;
        for(int i=0;i<=9;i++) {
            count=0;
            for(int j=0;j<n;j++) {
            if(i==arr[j]) {
            System.out.print(i+" ");
            count=1;
            }
            }
            if(count==0)
            System.out.print("-1"+" ");
            
        }
    }
}