import java.util.Scanner;
class EBill{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
float a=0,b=0,c=0,d=0,e=0;
String[] s1=new String[n];
s.nextLine();
for(int i=0;i<n;i++){
s1[i]=s.nextLine();
}
for(int i=0;i<n;i++){
String[] s2=s1[i].split("[:] ");
for(int j=1;j<s2.length;j++){
String[] s3=s2[j].split("[$]");
for(int k=0;k<s3.length;k++){
String[] s4=s3[k].split(" ");
if(s4[0].equals("shop1"))
  a+=Integer.parseInt(s4[1]);
  if(s4[0].equals("shop2"))
    b+=Integer.parseInt(s4[1]);
  if(s4[0].equals("shop3"))
  c+=Integer.parseInt(s4[1]);
  if(s4[0].equals("shop4"))
  d+=Integer.parseInt(s4[1]);
  if(s4[0].equals("shop5"))
  e+=Integer.parseInt(s4[1]);
}
}
}
int i=1;
bill(i++,a);
bill(i++,b);
bill(i++,c);
bill(i++,d);
bill(i++,e);
}
public static void bill(int i,float f){
if(f>5000)
f*=0.20;
else if(f<=5000&&f>=2001 )
f*=0.30;
else if(f<=2000&&f>=1000)
f*=0.33;
else
f*=0.40;
System.out.println("Shop"+i+" bill: "+f);
}
}