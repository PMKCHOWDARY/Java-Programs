import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();;
        String str=Integer.toBinaryString(a);
        //System.out.println(str);
        int count=0;
        for(int i=str.length()-1;i>0;i--) {
            if((str.charAt(str.length()-1))=='0') {
            if(str.charAt(i)=='0') {
                count++;
            }
            if(str.charAt(i)=='1') {
                break;
            }
             }
        }
        System.out.println(count);
}
}
