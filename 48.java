import java.util.*;
public class Main {
public static void main(String args[]) {
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++) 
arr[i]=s.nextInt();
int k=0;
for(int j=0;j<n;j++)  {
arr[k]=Math.abs(arr[j]*arr[j]);
k++;
}
Arrays.sort(arr);
for(int i=0;i<n;i++) 
System.out.print(arr[i]+" ");
}
}