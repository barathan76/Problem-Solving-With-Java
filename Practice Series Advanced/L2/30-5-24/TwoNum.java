import java.util.Scanner;
class TwoNum{
static void solve(int arr[],int n){
int repeated = 0;
int missing = 0;
int freq[] = new int[n];
for(int i =0;i<n;i++){
	freq[arr[i]-1]++;
}
for(int i =0;i<n;i++){
if(freq[arr[i]-1]>1)
	repeated = arr[i];
if(freq[i] == 0)
	missing = i+1;
}

System.out.print("Missing = "+missing+" Repeating = "+repeated);
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