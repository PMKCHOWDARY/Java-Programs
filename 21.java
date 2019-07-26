import java.util.*;
import java.util.Stack;
public class Main {
public static void main(String args[]) {
Scanner s=new Scanner(System.in);
String str=s.nextLine();
Stack<Character> stack=new Stack<Character>();
char c;
int flag=0;
for(int i=0; i < str.length(); i++) {
    c = str.charAt(i);

    if(c == '(' || c=='{' || c=='[')
      stack.push(c);
    else if(c == ')')
      if(stack.empty()) 
	flag=1;
      else if(stack.peek() == '(')
        stack.pop();
      else
	flag=1;
    else if(c == '}')
      if(stack.empty())
        flag=1;
      else if(stack.peek() == '{')
        stack.pop();
      else
	flag=1;
    else if(c == ']')
      if(stack.empty())
        flag=1;
      else if(stack.peek() == '[')
        stack.pop();
      else
	flag=1;
  }
if(flag==1)
System.out.println("not balanced");
else if(stack.empty())
System.out.println("balanced");
else
System.out.println("not balenced");
}
}

