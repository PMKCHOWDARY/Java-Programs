import java.util.Scanner;
import java.util.Arrays;
class count{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
char[] c=s1.toCharArray();
Arrays.sort(c);
for(int i=0;i<c.length;i++){
int count=1;
for(int j=i+1;j<c.length;j++){
if(c[i]==c[j]&&c[i]!='\0'){
count++;
c[j]='\0';
}
}
if(c[i]!='\0'){
if(count>1){
System.out.print(c[i]);
System.out.print(count);
}
else
System.out.print(c[i]);
}
}
}
}