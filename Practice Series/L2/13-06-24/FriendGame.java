import java.util.Scanner;
class FriendGame{



static int solve(int n,int k){
if(n == 1)
	return 1;
int ans = (solve(n-1,k) + k )% n;
return ans == 0 ? n : ans;

}
public static void main(String args[]){

Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int k = scan.nextInt();
System.out.println(solve(n,k));
}
}