import java.util.Scanner;
class ValidParenthesis{
static boolean solve(String str){
char stack[] = new char[str.length()];
int top =-1;
for(int i = 0;i<str.length();i++){
if(str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{'){	
stack[++top] = str.charAt(i);
System.out.println(stack[top]);
System.out.println(top);
continue;
	
}
if(top == -1)
	return false;
char c = str.charAt(i);
System.out.println(stack[top]);
switch(c){
	case ')' : if(stack[top] == '[' || stack[top] == '{')
			return false;
		else
			top--;
		break;
	case ']' : if(stack[top] == '('|| stack[top] == '{')
			return false;
		else
			top--;
		break;
	case '}' : if(stack[top] == '(' || stack[top] == '[')
			return false;
		else
			top--;
		break;
}
}

System.out.println(top);

if(top == -1)
	return true;
else 
	return false;

}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
System.out.println(solve(str));
}
}