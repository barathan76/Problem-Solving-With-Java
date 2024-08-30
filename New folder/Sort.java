import java.util.Scanner;
class Sort{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++)
	arr[i] = scan.nextInt();
int left = 0, right = n-1;
int ans[] = new int[n];
for(int i =n-1;i>=0;i--){
if(arr[left]>=arr[right])
	ans[i] = arr[left++];
else
	ans[i] = arr[right--];
}
for(int i =0;i<n;i++)
	System.out.print(ans[i]+" ");
}
}