import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Palindrome{
static char toLower(char c){
int i = (int) c;
if(i>=65 && i<=90){
	i+=32;
	return (char) i;
}
else
	return c;
}
static boolean isAlphaNumeric(char c){
int i = (int) c;
return (i>=65 && i<=90) || (i>=97 && i<=122) || (i>=48 && i<=57);
}
static boolean isPalindrome(String s){
StringBuilder builder = new StringBuilder();
for(int i =0;i<s.length();i++){
if(isAlphaNumeric(s.charAt(i))){
	builder.append(toLower(s.charAt(i)));
}	
}
System.out.println(builder);
return builder.toString().equals(builder.reverse().toString());
}
public static void main(String args[]){
try{BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String str = br.readLine();
System.out.println(isPalindrome(str));
}catch(IOException e){System.out.println(e);
}
}
}