import java.util.*;
public class Rect {
public static void main(String args[]) {
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++) 
arr[i]=s.nextInt();

Arrays.sort(arr);
int max=0,count=1;
for(int i=0;i<n-1;i++) {
if(arr[i]+1==arr[i+1]) {
count++;
if(count>max) 
max=count;
} else {
count=1;
} 
}
System.out.println(max);
}
}