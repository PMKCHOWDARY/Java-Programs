import java.util.Scanner;
import java.util.Arrays;
public class anagram{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
String s1,s2;
s1=s.nextLine();
char[] ch1=s1.toCharArray();
s2=s.nextLine();
char[] ch2=s2.toCharArray();
int count=0;
Arrays.sort(ch1);
Arrays.sort(ch2);
System.out.println(ch1);
System.out.println(ch2);
for(int i=0;i<ch1.length;i++){
if(ch1[i]!=ch2[i]){
count=1;
break;
}
}
if(count==0)
System.out.println("Anagram");
else
System.out.println("Not an Anagram");
}
}
