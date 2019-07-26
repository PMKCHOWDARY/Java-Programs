import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		String[] st=a.split(" ");
		int count,c=0;
		for(int i=0;i<st.length-1;i++) {
		    count=1;
		    for(int j=i+1;j<st.length;j++) {
		        if(st[i].equals(st[j])) {
		            count++;
		        }
		        st[j]="";
		    }
		    if(count<3 && count>1)
		    c++;
		}
		System.out.println(c);
	}
}
