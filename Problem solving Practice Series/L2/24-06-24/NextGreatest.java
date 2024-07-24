import java.util.Scanner;
class NextGreatest{
static int[] solve(int arr1[],int arr2[],int m,int n){
int ans[] = new int[m];

for(int i =0;i<m;i++){
int k = 0;
for(int j =0;j<n;j++){
if(arr1[i] == arr2[j]){
	k = j;
	break;
}
}
ans[i] = -1;
for(int j = k+1;j<n;j++){
if(arr2[j] > arr1[i]){
	ans[i] = arr2[j];
	break;
}
}
}
return ans;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int m = scan.nextInt();
int n = scan.nextInt();
int arr1[] = new int[m];
int arr2[] = new int[n];
for(int i =0;i<m;i++)
	arr1[i] = scan.nextInt();
for(int i =0;i<n;i++)
	arr2[i] = scan.nextInt();
int ans[] = solve(arr1,arr2,m,n);
for(int i =0;i<m;i++)
	System.out.print(ans[i]+" ");
}
}