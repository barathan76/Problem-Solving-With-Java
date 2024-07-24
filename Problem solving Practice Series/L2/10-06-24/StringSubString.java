import java.util.Scanner;
class StringSubString{
static void solve(String str,String ans,int i){
if(str == null || str.length() == 0)
	return;
if(i == str.length())
	System.out.println(ans);

for(int j =str.length()-1;j>=i;j--){
String sub = "{"+str.substring(i,j+1)+"}";
solve(str,ans+sub,j+1);
}


}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
solve(str,"",0);
}
}