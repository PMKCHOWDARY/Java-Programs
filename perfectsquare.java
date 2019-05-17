import java.util.Scanner;
class perfectsquare{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
double n,a=0;
n=sc.nextInt();
if(n>=1 && n<=1000){
a=Math.sqrt(n);
}
if(a*a==n){
System.out.println("Perfect square");
}
else{
System.out.println("Not a Perfect square");
}
}
}