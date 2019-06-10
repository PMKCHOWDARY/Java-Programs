import java.util.Scanner;
class EnclosedbyOne{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
String x="";
int a=0,count=0;
while(n>0){
a=n%2;
x=a+x;
n=n/2;
}
System.out.println(x);
char[] c=x.toCharArray();
if(c[0]==c[x.length()-1]){
for(int i=1;i<x.length()/2;i++){
for(int j=x.length()-2;j>=x.length()/2;j--){
if(c[i]==c[j]&&c[i]!='1'){
count++;
}
else{
count=0;
}
}
}
}
if(count>=1){
System.out.print("Yes");
}
else{
System.out.print("No");
}
}
}