import java.util.Scanner;
class Majority{
static int solve(int arr[],int n){
int freq[] = new int[100];
for(int i =0;i<n;i++){
freq[arr[i]]++;
}
for(int i =0;i<n;i++){
if(freq[i]>n/2)
	return i;
}
return -1;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++)
	arr[i] = scan.nextInt();
System.out.println(solve(arr,n));
}
}