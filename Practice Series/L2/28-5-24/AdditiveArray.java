import java.util.Scanner;
class AdditiveArray{
static boolean solve(String str,int index, int a,int b, int count){
if(index == str.length())
	return count>=3;

int n = 0;
for(int i = index;i<str.length();i++){
n = n*10+(str.charAt(i)-'0');
if(a==-1 || b==-1 || a+b == n){
if(solve(str,i+1,b,n,count+1))
	return true;
}
if(str.charAt(index) == '0')
	break;
}
return false;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
System.out.println(solve(str,0,-1,-1,0));
}
}