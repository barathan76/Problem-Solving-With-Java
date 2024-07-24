import java.util.Scanner;
class CovidTreatment{
static int solve(int arr[],int n,int k){
int sum = 0;
for(int i =0;i<k&&i<n;i++){
sum+=arr[i];
}
int max = sum;
for(int i =k;i<n;i++){
sum = sum - arr[i-k];
sum += arr[i];
max = Math.max(sum,max);
}
return max;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++){
arr[i] = scan.nextInt();
}
System.out.println("Enter the k factor");
int k = scan.nextInt();
System.out.println(solve(arr,n,k));
}
}