import java.util.Scanner;
public class vowel{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
String s1  = s.nextLine();
char[] arr = s1.toCharArray();
String str="";
String a=""; 
for(int i=0;i<arr.length;i++){
if(arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U'){
str=str+arr[i];
arr[i]='\0';
}
}
char[] ch1=str.toCharArray();
char[] ch2=new char[ch1.length];
int j=1;
for(int i=0;i<ch1.length-1;i++){
ch2[j]=ch1[i];
j++;
}
ch2[0]=ch1[str.length()-1];
int m=0;
for(int i=0;i<arr.length;i++){
if(arr[i]=='\0'){
arr[i]=ch2[m];
m++;
}
}
for(int i=0;i<arr.length;i++){
a=a+arr[i];
}
System.out.print(a);
}
}
