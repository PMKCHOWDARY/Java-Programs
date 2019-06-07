import java.util.Scanner;
class manualSubString{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
String s2=s.nextLine();
int a=0;
for(int i=0;i<=(s1.length()-s2.length());i++){
if(s1.substring(i,i+s2.length()).equals(s2)){
System.out.print(i);
a=i;
}
}
if(!s1.substring(a,a+s2.length()).equals(s2)){
  System.out.print("-1");
}
}
}