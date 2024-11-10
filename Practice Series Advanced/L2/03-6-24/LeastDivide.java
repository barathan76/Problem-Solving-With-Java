import java.util.Scanner;
class LeastDivide{
static String solve(String str1,String str2){
String ans = "";
int n = str1.length();
int m = str2.length();

if(n%m!=0)
	return ans;
String temp = str2;
while(temp.length()<n){
temp+=str2;
}


if(!str1.equals(temp))
	return ans;



String temp1 = "";
for(int i =0;i<m;i++){
temp1+=str2.charAt(i);
String k = temp1;
while(k.length()<m)
	k+=temp1;

if(str2.equals(k))
	break;
}


return temp1;

}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str1 = scan.nextLine();
String str2 = scan.nextLine();
System.out.println(solve(str1,str2));
}
}