import java.util.Scanner;
class Decode{

static boolean isNum(char c){
int i = (int) c;
if(c>=48 && c<=57)
	return true;
else
	return false;
}


static String findNum(String str,int i[],int n){
String ans = "";
int k = str.charAt(i[0])-'0';
for(int j = i[0]+1;j<n;j++){
if(!isNum(str.charAt(j))){
i[0] = j;
break;
}
k = k*10 + str.charAt(j) - '0';
}
String temp = find(str,i,n);
for(int j =0;j<k;j++){
ans+=temp;
}
return ans+find(str,i,n);
}


static String find(String str,int i[],int n){
if(i[0]  ==n-1 || str.charAt(i[0]) == ']'){
	return "";
}

String ans = "";
if(isNum(str.charAt(i[0])))
	ans+=findNum(str,i,n);

else if(str.charAt(i[0]) == '['){
i[0]++;
	ans+=find(str,i,n);	
}
else{
i[0]++;
	ans+=str.charAt(i[0])+find(str,i,n);
}

return ans;

}
static String solve(String str){
int i[] = new int[1];
i[0] = 0;
return find(str,i,str.length());
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
System.out.println(solve(str));
}
}