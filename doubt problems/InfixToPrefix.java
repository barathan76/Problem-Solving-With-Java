import java.util.Scanner;
import java.util.Stack;
class InfixToPrefix{

public static boolean isOperand(char c){
switch(c){
	case '+':
		return true;
	case '-':
		return true;
	case '*':
		return true;
	case '/':
		return true;
}
return false;
}
public static int compare(char a,char b){
if(a == '/'){
	if(b== '*' || b == '+' || b == '-')
		return -1;
}
if(a == '*'){
	if(b == '+' || b== '-')
		return -1;
}
if(a == '+'){
	if(b == '-')
		return -1;
}
return 1;
}

public static String convertToPrefix(String str){
StringBuilder builder = new StringBuilder();
Stack<Character> stack = new Stack<Character>();
String sub = "";
for(int i=0;i<str.length();i++){
System.out.println(builder.toString() + " "+sub);
if(isOperand(str.charAt(i))){
if(stack.isEmpty())
	stack.push(str.charAt(i));
else if(compare(str.charAt(i),stack.peek()) == -1){
	builder.append(str.charAt(i)+ "");
	while(!stack.isEmpty()){
		builder.append(stack.pop()+"");
}
	builder.append(sub.toString());
	sub = "";
}
else
	stack.push(str.charAt(i));
}
else
	sub += str.charAt(i);
}

while(!stack.isEmpty()){
builder.append(stack.pop()+"");
}
builder.append(sub.toString());

return builder.toString();


}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
System.out.println(convertToPrefix(str));
}
}