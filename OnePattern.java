import java.util.*;
public class OnePattern{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
int n = s.nextInt();
int a=11,b=0;
for(int i=1;i<=n;i++){
b=(int)Math.pow(a,i);
System.out.println(b);
}
}
}
