import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        String[] st=a.split(" ");
        for(int i=0;i<st.length;i++) {
            st[i]=Character.toUpperCase(st[i].charAt(0))+st[i].substring(1);
        }
        for(int i=0;i<st.length;i++) {
            System.out.print(st[i]+" ");
        }
    }
}