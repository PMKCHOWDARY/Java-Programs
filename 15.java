import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        String b=s.nextLine();
        if(a.contains(b)) {
           int  ind=a.indexOf(b.charAt(0));
            System.out.println(ind);
        } else {
            System.out.println("-1");
        }
        
    }
}