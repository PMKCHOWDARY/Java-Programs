import java.util.Scanner;
class  SumOfDigits{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,m,temp=0;
n=sc.nextInt();
if(n>=2 && n<=1000000){
while(n>0){
m=n%10;
n=n/10;
temp=temp+m;
}
}
System.out.println(temp);
}
}