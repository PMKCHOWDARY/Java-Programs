import java.util.Scanner;
class pattern{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,i,j,sum=1;
n=sc.nextInt();
for(i=1;i<=n;i++){
for(j=1;j<=i;j++){
System.out.print(sum+ " ");
sum++;
}
System.out.println();
}
}
} 