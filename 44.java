import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) 
        arr[i]=s.nextInt();
        int i=0,count=0;
        while(i<arr.length && arr[i]!=0) {
            i+=arr[i];
            if(i==arr.length-1) {
              System.out.println("true");
              count=1;
              break;
        }
        }
        if(count<1)
        System.out.println("false");
    }
}