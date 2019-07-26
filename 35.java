import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        String str=Integer.toBinaryString(a);
        System.out.println(str);
        int count=0;
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)=='1') {
                count++;
            }
        }
        if(count>1 && count<3) {
                if(str.charAt(0)=='1' && str.charAt(str.length()-1)=='1') 
                    System.out.println("yes");
                else
                System.out.println("no");
        } 
        else {
        System.out.println("no");
        }
}
}