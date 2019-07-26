import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int temp;
        for(int i=1;i<n;i++) {
             temp=1;
            for(int j=1;j<=i;j++) {
        System.out.print(temp);
            temp=temp*(i-j)/j;
        }
        System.out.println();
        }
    }
}
