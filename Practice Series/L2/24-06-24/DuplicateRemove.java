import java.util.Scanner;
class DuplicateRemove{
static String solve(String str){
String ans = "";
for(int i =0;i<str.length();i++){
if(ans.length()> 0 && str.charAt(i) == ans.charAt(ans.length()-1)){
	ans = ans.substring(0,ans.length()-1);
	continue;
}
ans+=str.charAt(i);
}
return ans;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
scan.close();
System.out.println(solve(str));
}
}