import java.util.*;
import java.lang.*;
public class Main {
  public static void main(String args[]) {
      //Scanner s=new Scanner(System.in);
    String a="i love u";
    String[] st=a.split(" ");
    for(int i=0;i<st.length;i++) {
      StringBuffer sb = new StringBuffer(st[i]); 
      st[i]="";
        st[i]+=sb.reverse();
    }
    for(int i=0;i<st.length;i++) {
    System.out.print(st[i]+" ");
    }
  }
}