import java.util.*;
public class Reverse2{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
String s1 = s.nextLine();
String[] s2=s1.split(" ");
for(int i=0;i<s2.length;i++){
	char[] c=s2[i].toCharArray();
	char temp;
	for(int j = 0;j<=c.length/2;j++){
		temp = c[j];
		c[j] = c[c.length-1-j];
		c[c.length-1-j] = temp;
	}
System.out.print(new String(c));
System.out.print(" ");
}
}
}