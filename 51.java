import java.util.*;
public class Main {
public static void main(String args[]) {
Scanner s=new Scanner(System.in);
int m=7;
int[] arr={9,12,3,5,14,10,10};
int[] ar=new int[m];
int p=10,temp=0;
for(int i=0;i<m;i++) {
  for(int j=i+1;j<m;j++) {
  if(arr[i]<arr[j]) {
  temp=arr[i];
  arr[i]=arr[j];
  arr[j]=temp;
  }
}
}
int i=0,j=1,k=0,mid=(m-1)/2;
while(i<m) {
if(arr[i]>=p) {
ar[m-j]=arr[i];
j++;
i++;
}
else if(arr[i]<=p){
ar[k]=arr[i];
k++;
i++;
}
else if(arr[i]==p) {
ar[mid]=arr[i];
mid++;
i++;
}
}
for(int p1=0;p1<m;p1++)
System.out.print(ar[p1]+" ");
}
}
