import java.util.Scanner;
class LowUpRemove{
static char upper(char c){
int i  = c -32;
return (char) i;
}
static String solve(String str){
char stack[] = new char[str.length()];
int top = -1;
for(int i =0;i<str.length();i++){
if(top> -1 && str.charAt(i) == upper(stack[top]))
	stack[top--] = '\0';
else
	stack[++top] = str.charAt(i);
}
return new String(stack);
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
scan.close();
System.out.println(solve(str));
}
}