import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
     int a=s.nextInt();
     int temp,count=0;
     for(int i=1;i<=a;i++) {
         temp=a%2;
         i=i/2;
         if(temp==1 || i==1)
         count++;
     }
     System.out.println(count);
    }
}