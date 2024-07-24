import java.util.Scanner;
class PrimeNumber{
static int solve(int n){
if(n == 0 || n == 1)
	return 0;
int count = 0;
if(n>3)
	count+=2;
for(int i =4;i<=n;i++){
boolean flag = false;
for(int j =2;j<=i;j++){
if(i%j == 0 && i!=j){
	flag = false;
	continue;
}
else
	flag = true;
}
if(flag)
	count++;
}
return count;
}


public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
System.out.println(solve(n));
}
}