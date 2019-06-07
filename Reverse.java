import java.util.*;
public class Reverse{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
String s1 = s.nextLine();
String[] s2=s1.split(" ");
for(int i=0;i<s2.length;i++){
	s2[i] = new String(new StringBuilder(s2[i]).reverse());
System.out.print(s2[i]);
System.out.print(" ");
}
}
}