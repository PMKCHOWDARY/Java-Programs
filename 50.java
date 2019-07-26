import java.util.*;
public class Main {
public static void main(String args[]) {
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int c1=0,c2=0,c3=0,c4=0;
while(n>=25) {
    c1=n/25;
    n=n%25;
}
while(n>=10) {
    c2=n/10;
    n=n%10;
}
while(n>=5) {
    c3=n/5;
    n=n%5;
}
while(n>=1) {
    c4=n/1;
    n=n%1;
}
System.out.println(c1+c2+c3+c4);
}
}