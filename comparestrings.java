import java.util.Scanner;
class comparestrings{
public static void main(String args[]){
Scanner n=new Scanner(System.in);
String s1,s2;
s1=n.nextLine();
s2=n.nextLine();
if(s1.equals(s2)){
System.out.println("Strings are equal");
}
else {
System.out.println("Strings are not equal");
}
}
}

