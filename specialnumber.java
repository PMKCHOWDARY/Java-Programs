import java.util.Scanner;
class specialnumber{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,m=0,a=0,temp=0,temp1=0;
n=sc.nextInt();
if(n>=10 && n<=99){
m=n/10;
a=n%10;
temp=m+a;
temp1=m*a;
}
if(n==temp+temp1){
System.out.println("Special Number");
}
else{
System.out.println("Not a Special Number");
}
}
}
