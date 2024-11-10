import java.util.Scanner;
class LongestZigZag{
static int solve(int arr[],int n){
if(n == 0 || n == 1)
	return n;
int i =0,j = 1;
int count = 1;
boolean flag = false;
while(i<n && j<n){
if(arr[i]<arr[j] && !flag){
count++;
i = j;
j++;
flag = true;
}
else if(arr[i]>arr[j] && flag){
flag = false;
count++;
i = j;
j++;
}
else{
j++;
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