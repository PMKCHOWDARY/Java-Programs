import java.util.*;
public class manyX {
    public static void main(String args[]) {
        int a=10;
        int[] arr={87,32,99,75,56,43,21,10,68,49};
        Arrays.sort(arr);
        int min=Math.abs(arr[0]-arr[1]);
        for(int i=0;i<arr.length-1;i++) {
        int diff=Math.abs(arr[i]-arr[i+1]);
        if(diff<min) {
            min=diff;
        }
        }
        System.out.println(min);
        
    }
}