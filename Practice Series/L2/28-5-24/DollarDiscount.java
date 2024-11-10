import java.util.Scanner;
class DollarDiscount{
static boolean isNum(int i){
if(i>=48 && i<=57)
	return true;
else 
	return false;
}
static String solve(String str,int dis){
String ans = "";
for(int i =0;i<str.length();i++){
if(i+1<str.length()){
if(str.charAt(i) == '$' && isNum((int)str.charAt(i+1))){
	int c = 0;
	for(int j= i+1;j<str.length();j++){
		if(isNum((int) str.charAt(j)))
			c++;
		else
			break;
	}
	ans+=str.charAt(i);
	String sub = str.substring(i+1,i+c+1);
	int k = Integer.parseInt(sub);
	float amount = (float)(dis*k)/100;
	ans+=amount;
	i+=c;	
}
else
	ans+=str.charAt(i);
}
else
	ans+=str.charAt(i);
}
return ans;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
int dis = scan.nextInt();
System.out.print(solve(str,dis));
}
}