import java.util.Scanner;
class AddBinary{

static String solve1(String a,String b,int i,int j,int c){
if(i>=0 || j>=0 || c==1){

if(i>=0)
	c+=a.charAt(i--)-'0';
if(j>=0)
	c+=b.charAt(j--)-'0';
return solve1(a,b,i,j,c/2) + c%2;
}
return "";

}


public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String a = scan.nextLine();
String b = scan.nextLine();
System.out.println(solve1(a,b,a.length()-1,b.length()-1,0));
}
}