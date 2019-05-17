import java.util.Scanner;
class foobar{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n;
n=sc.nextInt();
if(n%3==0 && n%5==0){
System.out.println("Foobar");
}
else if(n%3==0){
System.out.println("Foo");
}
else if(n%5==0){
System.out.println("Bar");
}
else{
System.out.println("None");
}
}
}