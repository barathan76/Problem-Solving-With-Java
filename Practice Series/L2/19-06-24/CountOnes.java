import java.util.Scanner;
class CountOnes{
static int solve(String str, int i){
if(i == str.length()){
return 0;
}

if(str.charAt(i) == '1')
	return 1 + solve(str,i+1);
return solve(str,i+1);
}


static int solvePositive(int n){
if(n == 1 || n == 0)
	return n;
if(n%2 == 1)
	return 1+solvePositive(n/2);
return solvePositive(n/2);
}

static int solveNegative(int n){
StringBuilder builder = new StringBuilder();
while(n>0){
if(n%2 == 1)
	builder.append(0);
else
	builder.append(1);
n=n/2;
}
for(int i =builder.length();i<32;i++){
builder.append(1);
}
StringBuilder ans = new StringBuilder();
int c = 1;
for(int i = 0;i<builder.length();i++){
c = c+ (builder.charAt(i)-'0');
ans.append(c%2);
c = c/2;
}
return solve(ans.toString(),0);
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
if(n>0)
	System.out.println(solvePositive(n));
else
	System.out.println(solveNegative(-n));
}
}