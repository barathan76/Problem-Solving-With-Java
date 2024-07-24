import java.util.Scanner;
class DecodeString{
static boolean isNum(char c){
int i = (int) c;
if(i>=48 && i<=57)
	return true;
else
	return false;
}
static String solve(String str){
int num = 0;
int stack[] = new int[str.length()];
int index = 0;
String ans = "";
boolean flag = true;
for(int i =0;i<str.length();i++){
if(isNum(str.charAt(i))){
if(flag){
int k = str.charAt(i) - '0';
for(int j =i+1;j<str.length();j++){
if(isNum(str.charAt(j)))
	k = k*10 +  str.charAt(j) - '0';
else {
	i = j-1;
	break;
}
}
stack[index++] = k;
System.out.println(stack[index-1]);
}
else{
String t = ans;
System.out.println(index);
for(int k = 0;k<stack[index];k++){
	ans+=t;
}
num = 0;
i = i-1;
index--;
continue;
}
}

if(str.charAt(i) == '['){
	flag = true;
	continue;
}else if(str.charAt(i) == ']'){
	flag = false;
	continue;
}
if(flag)
	ans+=str.charAt(i);

}
return ans;

}


public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
System.out.println(solve(str));
}
}