import java.util.Scanner;
class factorial{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,i,fact=1;
n=sc.nextInt();
for(i=1;i<=n;i++){
fact=fact*i;
}
System.out.println(fact);
}
}
