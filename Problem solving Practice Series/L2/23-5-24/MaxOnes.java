import java.util.Scanner;
class MaxOnes{

static int solve(int arr[][],int n,int m){
int max = Integer.MIN_VALUE;
int k =0;
for(int i =0;i<n;i++){
int count = 0;
for(int j = 0;j<m;j++){
	if(arr[i][j] == 1)
		count++;
}
if(count>max){
max = count;
k = i;
}
}
return k;

	
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.print("Enter no of the rows : ");
int n =scan.nextInt();
System.out.print("Enter no of columns : ");
int m = scan.nextInt();
System.out.println("Enter the array elements ");
int arr[][] = new int[n][m];
for(int i =0;i<n;i++)
	for(int j=0;j<m;j++)
		arr[i][j] = scan.nextInt();
System.out.println(solve(arr,n,m));
}
}