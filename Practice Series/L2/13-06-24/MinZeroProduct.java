import java.util.Scanner;
class MinZeroProduct{



static boolean shift(){
StrinBuilder builder = new StringBuilder();
}

static int findMinProduct(int arr[],int i,int j,int n,int min){
if(i == n || j == n)
	return min;

int subMin = min;
for(int k = j;k<n;k++){
int c = arr[i]^arr[k];
if(c == 0b11 || c == 0b111 || c == 0b1111){
	int a = arr[i];
	int b = arr[j];
	subMin = Math.min(subMin,(subMin * arr[j]+1)/(arr[i]*arr[j]));
	}
}

return findMinProduct(arr,i+1,j+1,n,subMin);

}
static int solve(int n){
if(n == 1)
	return 1;
int arr[] = new int[n];
int min = 1;
for(int i =0;i<n;i++){
arr[i] = i+1;
min*=(i+1);
}
return findMinProduct(arr,0,1,n,min);
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
System.out.println(solve(n));
}
}