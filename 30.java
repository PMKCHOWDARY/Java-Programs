import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int max=0;
        for(int i=1;i<=n;i++) {
            int count=0;
            for(int j=i;j<=n;j++) {
                if(i%j==0)
                count++;
            }
            if(count<3 && n%i==0) {
                if(i>max)
                max=i;
            }
        }
        System.out.println(max);
    }
}