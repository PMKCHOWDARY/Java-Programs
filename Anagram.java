import java.util.Scanner;
class Anagram{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
String s2=s.nextLine();
int count=0;
for(int i=0;i<s1.length();i++){
for(int j=0;j<s2.length();j++){
if(s1.charAt(i)==s2.charAt(j)){
count++;
}
}
}
if(count==s2.length())
System.out.println("Anagram");
else
System.out.println("Not an Anagram");
}
}