import java.util.Scanner;
class Repeating{
static int solve(int arr[],int n){
int max = 0;
for(int i=0;i<n;i++)
	max = Math.max(arr[i],max);
int freq[] = new int[max+1];

for(int i=0;i<n;i++)
	freq[arr[i]]++;
for(int i=0;i<n;i++){
	if(freq[arr[i]]>1) return arr[i];
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