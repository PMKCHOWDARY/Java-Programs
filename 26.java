import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=s.nextInt();
        int count=0,c=0;
        for(int i=0;i<n;i++) {
            count=1;
            for(int j=i+1;j<n;j++) {
                if(arr[i]==arr[j] && arr[i]!=0) {
                    count++;
                    arr[j]=0;
                }
        }
        
        if(count>n/2 && arr[i]!=0) {
            c++;
            System.out.println(arr[i]);
        }
        }
        if(c<1)
        System.out.println("-1");
}
}