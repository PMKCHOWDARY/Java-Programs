import java.io.*;
import java.util.*;
class stringConcat{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
String str1=s.nextLine();
String str2=s.nextLine();
s.close();
char arr[]=str1.toCharArray();
for(int i=0;i<arr.length;i++){
str2=str2.replaceAll(Character.toString(str1.charAt(i)),"");
}
System.out.println(str2);
}
}
