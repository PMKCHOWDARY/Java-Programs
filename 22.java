import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        String n=a.substring(0,2);
        int time=0;
        if((a.charAt(8)=='P') || (a.charAt(8)=='p')) {
            time=Integer.parseInt(n)+12;
        if(time==24) {
           System.out.println("00"+a.substring(2,8)); 
        }
        else {
        System.out.println(time+""+a.substring(2,8));
        }
        }
    }
}

