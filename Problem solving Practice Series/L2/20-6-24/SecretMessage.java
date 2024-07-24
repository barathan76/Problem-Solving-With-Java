import java.util.Scanner;
class SecretMessage{








static int solve1(String str){

int count = 0;
if(str.length() == 1){
if(str.charAt(0)!='0')
	return 1;
else
	return 0;
}
for(int i =0;i<str.length()-1;i++){
int a  = Integer.parseInt(str.substring(i,i+2));
if(a>=1 && a<=26 && str.charAt(i)!='0')
	count++;
if(str.charAt(i) == '0')
	count--;
}


return count+1;
}

static int recursive(String str,int i){
if(i == str.length())
	return 0;
for(int j = str.length()-1;j>=i;j--){
String sub = str.substring(i,j+1);
if(sub.length()>2){
return 1+recursive(str,j+1);
}
if(sub.length()==2){
int a = Integer.parseInt(sub);
if(a>=0 && a<=26)
	return 1+recursive(str,j+1);
else
	return recursive(str,j+1);
}
else
	return 1+recursive(str,j+1);
}
return 0;
}
static int solve(String str){
return recursive(str,0);
}

public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
System.out.println(solve1(str));
}
}