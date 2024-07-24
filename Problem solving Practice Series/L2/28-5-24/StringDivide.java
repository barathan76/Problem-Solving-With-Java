import java.util.Scanner;
class StringDivide{
static String solve(String s,String t){
int n = s.length();
int m = t.length();
if(n%m!= 0)
	return "-1";

String a = t;
while(a.length()<n){
a+=t;
}
if(!a.equals(s))
	return "-1";

for(int i =1;i<m;i++){
	String k = t.substring(0,i);
	String temp = k;
	while(temp.length()<m)
		temp+=k;
	if(temp.equals(t))
		return k;
}
return t;
}

public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String s = scan.nextLine();
String t = scan.nextLine();
System.out.println(solve(s,t));
}
}