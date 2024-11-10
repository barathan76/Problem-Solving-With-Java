import java.util.Scanner;
class SumCount{
static int solve(String str){
int sum = 0;
for(int i=0;i<str.length();i++){
if(isNum(str.charAt(i))){
int c = 0;
for(int j = i;j<str.length();j++){
if(isNum(str.charAt(j))) 
	c++;
else 
	break;
}

sum+=Integer.parseInt(str.substring(i,i+c));
i+=c;
}
}
return sum;
}
static boolean isNum(char c){
int i = (int) c;
return i>=48 && i<=57;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
System.out.println(solve(str));
}
}