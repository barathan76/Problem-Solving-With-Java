import java.util.Scanner;
class ChessBoard{
static boolean solve(String str){
if(str.length()>2)
	return false;

int i = str.charAt(0) - 'a'+1;
int j = str.charAt(1) - '0';

if(i%2 == 0 && j%2 == 0)
	return false;
else if(i%2 == 0)
	return true;

if(i%2==1 && j%2 == 0)
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