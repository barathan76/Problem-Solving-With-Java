/* 4:49 - 4:56 */
import java.util.Scanner;
class Q2{
static String solve(String str,int n){
	String ans = "";
	byte[] freq = new byte[127];
	for(int i =0;i<str.length();i++){
		
		freq[(byte) str.charAt(i)]++;
	}
	for(int i =0;i<str.length();i++){
		byte c = (byte) str.charAt(i);
		if(freq[c]>=n){
			freq[c] = -1;
			ans+=(char)c+" ";
		}
	}
	return ans;
	
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
int n = scan.nextInt();
System.out.println(solve(str,n));
	
}
}


/*
C:\Users\inc5540-32\Documents\Main test\L2\Test 4>java Q2
ababbcacbc
3
a b c

C:\Users\inc5540-32\Documents\Main test\L2\Test 4>java Q2
abbabbzcckidc
2
a b c

*/