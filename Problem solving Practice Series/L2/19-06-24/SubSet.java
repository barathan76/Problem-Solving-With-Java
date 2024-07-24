import java.util.Scanner;
class SubSet{
static void recursive(int arr[],int i,int n,String current){
if(i == n){
	System.out.print(current+" ");
	return;
}
recursive(arr,i+1,n,current);
recursive(arr,i+1,n,current+arr[i]);

}
static void solve(int arr[],int n){
recursive(arr,0,n,"");
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++)
	arr[i] = scan.nextInt();
solve(arr,n);
}
}