import java.util.Scanner;
class DefangedIP{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
String ans = "";
for(char c: str.toCharArray()){
if(c == '.')
	ans+="[.]";
else
	ans+=c;
}
System.out.println(ans);
}
}