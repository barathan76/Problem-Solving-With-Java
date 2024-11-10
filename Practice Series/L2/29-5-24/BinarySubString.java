import java.util.Scanner;
class BinarySubString{
static void solve(String str,int n,int k,int m)
{
int ans = 0;
int ones = 0;
char c[] = new char[n];
for(int i =0;i<n-1;i++)
	c[i] = str.charAt(i);

for(int i =0;i<k;i++){
if(c[i] == '1' && ones <=m)
	ones++;
if(ones>m){
	c[i] = '0';
	ones--;
	ans++;
}
}


for(int i=k;i<n;i++){
if(c[i-k] == '1')
	ones--;
if(c[i] == '1')
	ones++;
if(ones>m){
	int j = i;
	int range = j-k+1;
	while(ones>m && j>=range){
	if(c[j] == '1'){
		c[j] = '0';
		ones--;
		ans++;
}
j--;
}

}
}
System.out.println(ans);
for(int i =0;i<n;i++)
	System.out.print(c[i]);
}


public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int k = scan.nextInt();
int m = scan.nextInt();
scan.nextLine();
String str = scan.nextLine();
solve(str,n,k,m);
}
}