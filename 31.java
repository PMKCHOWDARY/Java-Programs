import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String a=new Integer(n).toString();
        char[] ch=a.toCharArray();
        a="";
        for(int i=ch.length-1;i>=0;i--) {
            a=a+ch[i];
        }
        int m=Integer.parseInt(a);
        if(m==n)
        System.out.println("true");
        else
        System.out.println("false");
}
}