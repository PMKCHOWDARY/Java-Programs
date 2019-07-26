import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
       String a=s.nextLine();
       String[] str=a.split(" ");
       int count=0;
       for(int i=0;i<str.length;i++) {
           if(str[i].charAt(0)>47 && str[i].charAt(0)<56) {
               System.out.println(str[i]);
           } else if(str[i].charAt(0)=='9') {
               System.out.println("");
           } else {
               count++;
           }
       }
       if(count==str.length)
       System.out.println("-1");
    }
}