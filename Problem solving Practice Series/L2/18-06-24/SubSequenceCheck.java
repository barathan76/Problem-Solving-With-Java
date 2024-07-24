import java.util.Scanner;
class SubSequenceCheck{
static boolean recursive(String str,String match,int i,String current){
if(current.equals(str))
	return true;
if(i==match.length())
	return false;

return recursive(str,match,i+1,current+match.charAt(i))|| recursive(str,match,i+1,current);
}
static boolean solve(String str, String match){
return recursive(str,match,0,"");
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
String match = scan.nextLine();
System.out.println(solve(str,match));
}
}