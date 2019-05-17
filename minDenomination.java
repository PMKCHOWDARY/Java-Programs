import java.util.Scanner;
class minDenomination{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int amt,r500,r100,r50,r20,r10,r5,r2,r1=0;
amt=sc.nextInt();
if(amt>=1 && amt<=10000){
while(amt>=500){
r500=amt/500;
amt=amt%500;
System.out.println("500: "+r500);
}
while(amt>=100){
r100=amt/100;
amt=amt%100;
System.out.println("100: "+r100);
}
while(amt>=50){
r50=amt/50;
amt=amt%50;
System.out.println("50: "+r50);
}
while(amt>=20){
r20=amt/20;
amt=amt%20;
System.out.println("20: "+r20);
}
while(amt>=10){
r10=amt/10;
amt=amt%10;
System.out.println("10: "+r10);
}
while(amt>=5){
r5=amt/5;
amt=amt%5;
System.out.println("5: "+r5);
}
while(amt>=2){
r2=amt/2;
amt=amt%2;
System.out.println("2: "+r2);
}
while(amt>=1){
r1=amt/1;
amt=amt%1;
System.out.println("1: "+r1);
}
}
}
}