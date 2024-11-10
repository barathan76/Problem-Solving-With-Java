import java.util.Scanner;
class XSubArray{
static int solve(int arr[],int n){
int ans[] = new int[n*n];
int index = 0;
for(int i =0;i<n;i++){
int xor = 0;
for(int j = i;j<n;j++){
xor|=arr[j];
ans[index++] = xor;
}
}
int count = 0;

for(int i =0;i<index;i++){
boolean flag = true;
System.out.print(ans[i]+" ");
for(int j = 0;j<i;j++){
if(ans[i] == ans[j]){
	flag = false;
	break;
}
}
if(flag)
	count++;
}
return count;

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