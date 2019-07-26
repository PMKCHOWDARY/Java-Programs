import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int count=0;
        String str=Integer.toString(n);
        String str1=Integer.toString(m);
        if(str.length()==str1.length()) {
            for(int i=0;i<str.length();){
                for(int j=0;j<str1.length();) {
                    if(str.charAt(i)==str1.charAt(j)) {
                        count++;
                        i++;
                        j++;
                    }
                }
            }
        }
        if(count==str.length())
        System.out.println("equal");
        else
        System.out.println("not equal");
    }
}