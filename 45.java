import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        String str1=s.nextLine();
        String str2=s.nextLine();
        int m=0,count=0;
        char[] ch=str1.toCharArray();
        if(str1.length()==str2.length()) {
        for(int i=m;i<ch.length;i++) {
        str1="";
            for(int j=i;j<ch.length;j++) {
             str1+=ch[j];
            }
            
            if(i!=0)
            for(int j=0;j<i;j++)
            str1+=ch[j];
            
            if(str1.equals(str2))
            count++;
            m++;
        }
        
        if(count>0) 
        System.out.print("true");
        else
        System.out.print("false");
    } else {
        System.out.println("false");
    }
        }
        }