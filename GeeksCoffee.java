import java.util.*;
public class GeeksCoffee{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
int a=0;
int n=s.nextInt();
int k=s.nextInt();
for(int i=1;i<k;i++){
n=n/2;
}
System.out.print(n);
}
}