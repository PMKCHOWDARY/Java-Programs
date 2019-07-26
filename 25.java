import java.util.*;
public class semis {
public static void main(String args[]) {
Scanner s=new Scanner(System.in);
int x=s.nextInt();
int[] arr1=new int[x];
int[] arr2=new int[x];
for(int i=0;i<x;i++)
arr1[i]=s.nextInt();
for(int i=0;i<x;i++)
arr2[i]=s.nextInt();
int w=0;
for(int z=0;z<arr1.length;z++) {
int count=0;
int n=arr1[z];
int m=arr2[w];
int[] arr=new int[m];
int y=0,k=1;
int flag=0;
arr[0]=2;
for(int i=3;i<=m;i++) {
for(int j=2;j<i;j++) {
 if(i % j == 0){
   flag = 0;
   break;
}
  else{
 flag = 1;
  }
   }
if(flag==1)
arr[k]=i;
k++;
}
for(int i=0;i<arr.length;i++) {
  if(arr[i]!=0) {
  for(int j=i;j<arr.length;j++) {
     if(arr[j]!=0) {
    int temp=arr[i]*arr[j];
    if(temp>=n && temp<=m)
    count++;
  }
  }
}
}
System.out.println(count);
w++;
}
}
}