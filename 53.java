import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=s.nextInt();
        int unique=n;
        for(int i=0;i<n;i++) {
           int count=1;
            for(int j=i+1;j<n;j++) {
         if(arr[i]==arr[j] && arr[i]!=0) {
         count++;
         arr[j]=0;
         }
            }
            
         if(count<2 && arr[i]!=0) { 
         if(arr[i]<unique)
         unique=arr[i];
         
         }
        }if(unique==n)
        System.out.println("-1");
        else
        System.out.println(unique);
    }
}