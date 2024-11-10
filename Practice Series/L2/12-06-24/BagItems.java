import java.util.Scanner;
class BagItems{
static int solve(int ones,int zeros,int neg,int k){
int ans = 0;
if(k<= ones)
	return k;
else{
ans = ones;
k -= ones;
if(k<= zeros)
	return ans;
else{
k-=zeros;
return ans-k;	
}
}
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int ones = scan.nextInt();
int zeros = scan.nextInt();
int neg = scan.nextInt();
int k = scan.nextInt();
System.out.println(solve(ones,zeros,neg,k));
}
}