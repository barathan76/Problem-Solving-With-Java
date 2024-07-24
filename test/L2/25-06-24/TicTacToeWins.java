import java.util.Scanner;
class TicTacToeWins{
static int getMatches(int n){

if(n == 1)
	return 1;

return n + getMatches(n-1);

}
/*static int solve(int i,int n,int val,int ans){
if(i == n && val == 3)


return Math.min(a,b);

}*/
static int maxFact(int n){
if(n ==1)
	return 1;

return n*n + maxFact(n-1);

}
static int getMin(int n,int k){
if(n == 1)
	return k*k;
return k*k+getMin(n-1,k);
}
static int getMinFact(int n, int k,int v){
if(n == 2)
	return k*k + v*v;
return k*k + v*v +getMinFact(n-2,k,v);
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int matches = getMatches(n-1);
int max = maxFact(n-1);
int min =0;
if(n%2 == 0)
	min = getMinFact(n,matches/n,matches%n);
else
	min = getMin(n,matches/n);
System.out.println(min);
System.out.println(max);

}

}