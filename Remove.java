import java.util.Scanner;
class Remove{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
String s1,s2;
s1=s.nextLine();
s2=s.nextLine();
String sum="";
String[] m=s1.split("\\s");
for(int i=0;i<m.length;i++){
if(!m[i].equals(s2)){
sum +=m[i]+" ";
}
}
System.out.println(sum);
}
}
