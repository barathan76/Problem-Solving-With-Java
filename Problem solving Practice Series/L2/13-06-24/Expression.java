import java.util.Scanner;
class Expression{
static boolean isNum(char c){
int i = (int) c;
if(i>=48 && i<=57)
	return true;
else 
	return false;
}

static boolean isOperand(char c){
if(c == '*' || c == '-' || c == '+' || c == '/')
	return true;
else 
	return false;
}
static int solve(String str,int i,int n){
if(i == n-1)
	return str.charAt(i) - '0';
int num = 0;
if(isNum(str.charAt(i))){
boolean flag = true;
for(int j = i+1;j<n;j++){
	if(!isNum(str.charAt(j))){
		num = Integer.parseInt(str.substring(i,j));
		i = j - 1;
		flag = false;
		break;
	}		
}
if(flag){
	num = Integer.parseInt(str.substring(i,n));
	return num;
}
}

switch(str.charAt(i+1)){
case '+':
	return num + solve(str,i+2,n);
case '-':
	return num - solve(str,i+2,n);
case '*':
	return num * solve(str,i+2,n);
case '/':
	return num / solve(str,i+2,n);
}
return 0;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
System.out.println(solve(str,0,str.length()));
}
}