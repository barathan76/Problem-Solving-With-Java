import java.util.Scanner;

class DecodeString{

static String solve(String str,int i[]){

StringBuilder ans = new StringBuilder();
int count = 0;
while(i[0]<str.length()){
char c = str.charAt(i[0]);
i[0]++;
if(c == '['){
String t = solve(str,i);
for(int k =0;k<count;k++)
	ans.append(t);
count = 0;
}else if(c == ']')
	break;
else if(c>='0' && c<='9')
	count = 10*count + (c-'0');
else
	ans.append(c);
}
return ans.toString();

}
public static void main(String args[]){

Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
int i[] = new int[1];
System.out.println(solve(str,i));

}

}