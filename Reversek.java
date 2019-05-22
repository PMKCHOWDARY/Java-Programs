import java.util.Scanner;
import java.util.Arrays;
class Reversek{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
String s2="",rev="",s3="";
int k=s.nextInt();
String[] sc=s1.split("\\s");
for(int i=0;i<sc.length;i++){
for(int j=k-1;j<k;j++){
s2=sc[j];
s3=s3+sc[i];
for(int n=s2.length()-1;n>=0;n--){
rev=rev+s2.charAt(n);
s3=rev+sc[i].charAt(j);
}
}
}
System.out.println(rev);
System.out.println(s3);
}
}