import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int t1 = 0, t2 = 1,count=0;
        for (int i = 1; i <= n; ++i)
        {
            if(n==t1) 
                count++;
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        if(count>0) 
        System.out.println("True");
        else 
        System.out.println("False");
    }
}