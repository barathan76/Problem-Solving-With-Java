import java.util.Scanner;
class EncodeString{
static boolean lower(int i){
if(i>=97 && i<=122)
	return true;
else 
	return false;
}
static boolean upper(int i){
if(i>=65 && i<=90)
	return true;
else 
	return false;
}
static String solve(String str){
String ans = "";
for(char c : str.toCharArray()){
int i = (int)c;
if(lower(i)){ 
	i = 122 - (i- 97);
	ans += (char)i;
}
else if(upper(i)){
	i = 90 - (i - 65);
	ans += (char)i;
}
else
	ans+=c;
}
return ans;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
System.out.println(solve(str));
}
}