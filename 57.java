import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int[] arr=new int[m];
        for(int i=0;i<m;i++)
        arr[i]=s.nextInt();
        int count=0;
        for(int i=0;i<m-1;i++) {
            for(int j=i+1;j<m;j++) {
                arr[i]=arr[i]+arr[j];
            if(arr[i]==0)
            count++;
            }
        }
        if(count>0)
        System.out.println("true");
        else
        System.out.println("false");
    }
}