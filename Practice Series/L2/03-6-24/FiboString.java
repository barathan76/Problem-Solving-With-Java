import java.util.Scanner;
class FiboString{
static String getFiboString(int n){
String str[] = new String[n+1];
str[0] = "a";
str[1] = "b";
for(int i =2;i<=n;i++){
str[i] = str[i-1]+str[i-2];
}
return str[n-1];
}
static void solve(String arr[],int n,int m){
String fiboString = getFiboString(n);
System.out.println(fiboString);
int ans[] = new int[m];
int len = fiboString.length();

for(int i = 0;i<len;i++){
String sub = "";
for(int j =i;j<len;j++){
sub+=fiboString.charAt(j);
for(int k = 0;k<m;k++){
if(arr[k].equals(sub))
	ans[k]++;
}
}
}

for(int i =0;i<m;i++)
	System.out.println(ans[i]);
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int m = scan.nextInt();
scan.nextLine();
String arr[] = new String[m];
for(int i =0;i<m;i++)
	arr[i] = scan.nextLine();

solve(arr,n,m);
}
}