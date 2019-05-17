import java.util.Scanner;
public class lcmGcd{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int p1,p2;
p1=sc.nextInt();
p2=sc.nextInt();
int lcm=(p1>p2)?p1:p2;
while(true){
if(lcm%p1==0 && lcm%p2==0){
System.out.println(lcm);
break;
}
lcm++;
}
int gcd;
for(int i=1;i<=p1 && i<=p2;i++){
if(p1%i==0 && p2%i==0){
gcd=i;
System.out.println(gcd);	
}
}
}
}