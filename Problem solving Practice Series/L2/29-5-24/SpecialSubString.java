import java.util.Scanner;
class SpecialSubString
{
static boolean check(String str){
int n = str.length();
if(n == 1)
	return true;
else if(n%2 == 1){
	int i = 0,j = n-1;
	while(i<n/2 && j>n/2){
	if(str.charAt(i) != str.charAt(j))
		return false;
	else
		i++;j--;
	}
return true;
}
else{
	return false;
}
}
static int solve(String str){
int i =0;
int j =0;
int n = str.length();
int count = 0;
while(i<n&&j<n){
String temp = subString(str,i,j);
if(check(temp)){
	count++;	
}
//System.out.print(temp+ " ");
if(j==n-1){
i++;
j = i;
}else
	j++;
}
return count;
}
static String subString(String str,int i,int j){
String temp = "";
for(int k=i;k<=j;k++)
	temp+=str.charAt(k);
return temp;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str= scan.nextLine();
System.out.println(solve(str));
}
}