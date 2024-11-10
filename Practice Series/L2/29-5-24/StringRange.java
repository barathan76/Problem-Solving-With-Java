import java.util.Scanner;
class StringRange{
static String solve(String str,int l, int r){
String ans = "";
if(l<0 || l>str.length()-1 || r>str.length()-1 || r<0)
	return ans;
else{
for(int i =l;i<=r;i++)
	ans+=str.charAt(i);
return ans;
}
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.print("S = ");
String str = scan.nextLine();
System.out.print("L = ");
int l = scan.nextInt();
System.out.print("R = ");
int r = scan.nextInt();
System.out.println(solve(str,l,r));
}
}