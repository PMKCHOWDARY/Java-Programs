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
            count=1;
            for(int j=i+1;j<m;j++) {
                if(arr[i]==arr[j]) {
                System.out.print(arr[i]);
                return;
                }
            }
        }
    }
}