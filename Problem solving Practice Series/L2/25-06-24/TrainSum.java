import java.util.Scanner;
class TrainSum{
static int solve(int arrival[],int departure[],int n){
int max = 0;
for(int i =0;i<n;i++){
max = Math.max(departure[i],max);
}
int arr[] = new int[max+2];
for(int i =0;i<n;i++){
arr[arrival[i]]+=1;
arr[departure[i]+1]-=1;
}


int count = 0;
int ans = 0;
for(int i =0;i<=max;i++){
count +=arr[i];
ans = Math.max(ans,count);
}
return ans;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arrival[] = new int[n];
int departure[] = new int[n];
for(int i =0;i<n;i++)
	arrival[i] = scan.nextInt();
for(int i =0;i<n;i++)
	departure[i] = scan.nextInt();
System.out.println(solve(arrival,departure,n));
}
}