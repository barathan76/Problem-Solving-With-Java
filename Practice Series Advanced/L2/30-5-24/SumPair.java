import java.util.Scanner;
class SumPair{
static void solve(int arr[],int n,int k){
int a = 0, b = 0;
int i =0;int j =n-1;
int min = Integer.MAX_VALUE;
while(i<n-1 && j>1){
int sum = arr[i]+arr[j];
if(sum == k){
	System.out.print(arr[i]+ " and "+arr[j]);
	return;}
else if(sum > k){
	j--;
}
else{
if(k - sum < min){
a = i;
b = j;
min  = k-sum;
}
i++;
}
}

System.out.println(arr[a]+" and "+arr[b] );
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int k = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++)
	arr[i] = scan.nextInt();

solve(arr,n,k);

}
}