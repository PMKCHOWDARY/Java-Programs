import java.util.Scanner;
import java.util.Arrays;
class Revk{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
String s2="";
int k=s.nextInt();
String[] sc=s1.split("\\s");
if(k>sc.length){
System.out.println("-1");
}
else{
for(int i=0;i<sc.length;i++){
if(k-1!=i)
System.out.print(sc[i]+ " ");
if(k-1==i){
for(int j=sc[i].length()-1;j>=0;j--){
s2=s2+sc[i].charAt(j);
}
System.out.print(s2+ " ");
}
}
}
}
}