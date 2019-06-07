import java.util.*;
import java.util.Arrays;
public class Matrix{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
int c=0;
int n1 = s.nextInt();
int n2 = s.nextInt();
int[][] a= new int[n1][n2];
for(int i=0;i<n1;i++){
for(int j=0;j<n2;j++){
a[i][j]=s.nextInt();
} 
}
int n3 = s.nextInt();
int n4 = s.nextInt();
int n5 = s.nextInt();
int n6 = s.nextInt();
for(int i=n3-1;i<n5;i++){
for(int j=n4-1;j<n6;j++){
c+=a[i][j];
}
}
System.out.print(c);
}
}