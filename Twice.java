import java.util.Scanner;
class Twice{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
String s2="";
String[] s3=s1.split("\\s");
for(int i=0;i<s3.length;i++){
int count=0;
for(int j=0;j<s3.length;j++){
if(s3[i].equals(s3[j]))
count++;
}
if(count==2){
if(!s2.contains(s3[i]))
s2=s2+s3[i]+" ";
}
}
System.out.print(s2);
}
}