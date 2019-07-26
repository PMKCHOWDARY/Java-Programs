import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int x=Math.abs(a);
        int y=Math.abs(b);
        int c=0;
        for(int i=0;i<x;i++) {
            c=c+(y);
        }
        if((a<0 && b>0) || (a>0 && b<0))
        System.out.println(0-c);
        else
        System.out.println(c);
}
}