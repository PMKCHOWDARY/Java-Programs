import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
    int binaryGap = 0;
    String binaryString = Integer.toBinaryString(N);
    char[] ch = binaryString.toCharArray();
    int count = 0;
    for (int i = 0; i < ch.length; i++) {
        if (ch[i]=='0') {
            count++;
        }

        if (ch[i]=='1') {
            if (count > binaryGap ){
                binaryGap = count;
            }
            count = 0;
        }
    }
    System.out.println(binaryGap);
    
}
}
