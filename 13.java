import java.util.*;
public class Main {
    public static void main(String args[]) {
        int a=5;
        int[] arr={1,100,42,4,23};
        Arrays.sort(arr);
        int max=Math.abs(arr[0]*arr[1]);
        for(int i=0;i<arr.length-1;i++) {
        int product=Math.abs(arr[i]*arr[i+1]);
        if(product>max) {
            max=product;
        }
        }
        System.out.println(max);
        
    }
}
