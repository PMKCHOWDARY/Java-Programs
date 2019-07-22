import java.util.Scanner;
class countToAlphabets{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
char[] c=s1.toCharArray();
    for(int i=0;i<c.length;i++){
    if(i!=c.length-1&&c[i]>=97&&c[i+1]>48&&c[i+1]<=57){
      for(int j=0;j<(c[i+1]-48);j++){
        System.out.print(c[i]);
    }
    }
    else if(c[i]>=97)
    System.out.print(c[i]);
}
}
}