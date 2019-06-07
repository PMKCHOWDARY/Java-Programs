import java.util.*;
import java.lang.*;
public class sudoku{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int[][] grid=new int[9][9];
for(int i=0;i<9;i++){
for(int j=0;j<9;j++){
grid[i][j]=s.nextInt();
}
}
int flag=0,f=0;
for(int i=0;i<9;i++){
String str="";
for(int j=0;j<9;j++){
if(!str.contains(Integer.toString(grid[i][j])))
str=str+grid[i][j];
else{
flag=1;
break;
}
}
if(flag==1)
break;
}
if(flag!=1)
for(int i=0;i<9;i++){
String str="",flag=0;
for(int j=0;j<9;j++){
if(!str.contains(Integer.toString(grid[j][i])))
str=str+grid[j][i];
else{
f=1;
break;
}
}
if(f==1)
break;
}
if(f!=1&&flag!=1)
System.out.println(1);
else
System.out.println(0);
}
}