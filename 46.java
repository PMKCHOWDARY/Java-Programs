import java.util.*;
public class Main {
public static void main(String args[]) {
Scanner s=new Scanner(System.in);
int n=s.nextInt();
String a=Integer.toBinaryString(n);
if(a.length()%2!=0)
a="0"+a;
char[] arr=a.toCharArray();
for(int i=0;i<arr.length-1;i++) {
    char temp=arr[i];
    arr[i]=arr[i+1];
    arr[i+1]=temp;
    i++;
}
String str="";
for(int i=0;i<arr.length;i++)
 str = str+arr[i];

System.out.println(Integer.parseInt(str,2));
}
}