import java.util.Scanner;

class BalancedSubArray{
static int gcd(int a,int b){
if(b==0)
	return a;
else 
	return gcd(b,a%b);
}



static int lcm(int arr[],int i,int j){
int ans = arr[i];
for(int k = i;k<=j;k++){
int a = arr[k];
ans = (a*ans)/gcd(a,ans);
}
return ans;
}



static int solve(int arr[],int n){
int count = 0;
for(int i =0;i<n;i++){
int sum = 0;
for(int j =i;j<n;j++){
sum+=arr[j];
if(sum%2 == lcm(arr,i,j)%2){
count++;
}
}
}
return count;
}



public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++){
arr[i] = scan.nextInt();
}
System.out.println(solve(arr,n));
}
}
