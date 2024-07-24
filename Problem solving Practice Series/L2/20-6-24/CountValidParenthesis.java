import java.util.Scanner;
class CountValidParenthesis{



static boolean isValid(String s){

 int i = -1;
 char[] stack = new char[s.length()];
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[')
                stack[++i] = ch;
            else {
                if (i >= 0
                    && ((stack[i] == '(' && ch == ')')
                        || (stack[i] == '{' && ch == '}')
                        || (stack[i] == '[' && ch == ']')))
                    i--;
                else
                    return false;
            }
        }
        return i == -1;



}
static int solve(String str){
int count = 0;
for(int i =0;i<str.length();i++){
String sub = "";
for(int j =i;j<str.length();j++){
sub+=str.charAt(j);
if(isValid(sub))
	count = Math.max(count,sub.length());
}
}
return count;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
System.out.println(solve(str));
}
}