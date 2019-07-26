import java.util.*;
public class manyX {
    public static void main(String args[]) {
        int a=5;
        int b=10;
        int temp=0;
        for(int i=1;i<=a;i++) {
            if(i%2!=0) {
                temp++;
            }
        }
        System.out.println(temp*b);
    }
}