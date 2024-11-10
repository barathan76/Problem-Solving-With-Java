/*5:06 - 5:12*/
import java.util.Scanner;

class ExcelTile{
static int solve(String s){
	int ans = 0;
	for(int i =0;i<s.length();i++){
		ans = ans*26 + (s.charAt(i) - 'A') + 1;
	}
	return ans;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String s = scan.nextLine();
System.out.println(solve(s));
}
}



/*
ZY


AB


*/