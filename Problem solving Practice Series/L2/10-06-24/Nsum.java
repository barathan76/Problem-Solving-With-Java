import java.util.Scanner;
class Nsum{
static void findDigits(int sum,int n,int arr[],int index){
if(index>n || sum<0)
	return;
if(index == n)
{
if(sum == 0){
arr[index] = 0;
for(int i =0;i<index;i++)
	System.out.print(arr[i]);
System.out.println(" ");
}
return;
}

for(int i =0;i<=9;i++)
{
arr[index] = i;
findDigits(sum-i,n,arr,index+1);
}
}

static void solve(int sum,int n){
int arr[] = new int[n+1];
for(int i =1;i<=9;i++){
arr[0] = i;
findDigits(sum-i,n,arr,1);
}
}

public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int sum = scan.nextInt();
int n = scan.nextInt();
solve(sum,n);
}
}