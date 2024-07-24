import java.util.Scanner;
class FormatPhoneNumber{
static boolean isNum(char c){
int i = (int) c;
if(i>=48 && i<=57)
	return true;
else 
	return false;
}


static String getArray(String str, int[] i, int n){
String ans = "";
while(i[0]<str.length() && n>0){
if(isNum(str.charAt(i[0]))){
	n--;
	ans+=str.charAt(i[0]);	
}
i[0]++;
}
return ans;
}


static String solve(String str){
String ans = "";
int n = 0;
for(int i =0;i<str.length();i++){
if(isNum(str.charAt(i)))
	n++;
}
int i[] = new int[1];
i[0] = 0;
while(n>0 && i[0]<str.length()){
if(ans.length()>=2){
ans+= "-";
}
if(n-3 ==0 || n-3 >1){
ans+= getArray(str,i,3);
n-=3;
}
else{
ans+= getArray(str,i,2);
n-=2;
}
}
return ans;

}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
System.out.println(solve(str));
}
}