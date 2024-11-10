import java.util.Scanner;
class SelectCities{

static void solve(int i,int n,int val,long count[]){
if(i==n && val>=1 ){
	count[0]++;
	return;
}
if(i == n)
	return;
solve(i+1,n,val+1,count);
solve(i+1,n,val,count);
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
long count[] = new long[1];
solve(0,n,0,count);
System.out.println(count[0] % 1000000007);
}

}