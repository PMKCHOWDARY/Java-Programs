import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String[] a=str.split(" ");
        str="";
        for(int i=a.length-1;i>=0;i--) {
            str+=a[i]+" ";
        }
        System.out.println(str=str.trim());
    }
}