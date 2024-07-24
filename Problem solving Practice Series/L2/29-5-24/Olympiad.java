import java.util.Scanner;
class Olympiad{
static int solve(String str, int n){
int k =4;
if(n<k)
	return 0;
int count = 0;
for(int i =0;i<n-k+1;i++){
if(str.charAt(i) == str.charAt(i+2) && str.charAt(i+1) == str.charAt(i+3))
	count++;
}
return count;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
scan.nextLine();
String str = scan.nextLine();
System.out.println(solve(str,n));
}
}