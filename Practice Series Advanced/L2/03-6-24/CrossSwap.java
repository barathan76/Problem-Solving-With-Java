import java.util.Scanner;

class CrossSwap{
static void swap(int arr[][],int i,int k){
int temp = arr[i][k];
arr[i][k] = arr[k][i];
arr[k][i] = temp;
}

static boolean lexi(int matrix[][],int temp[][],int n,int k){
for(int i =0;i<n;i++){
if(i == k)
	continue;
for(int j =0;j<n;j++){
if(!(temp[i][j]<=matrix[i][j]))
	return false;

}
}
return true;
}
static boolean recursive(int matrix[][],int temp[][], int n,int k){

if(k<n){

for(int i =0;i<n;i++)
	swap(temp,i,k);
System.out.println();
print(temp);
if(lexi(matrix,temp,n,k))
	return true;


System.out.println();
return recursive(matrix,temp,n,k+1);
}

return false;

}

static void assign(int matrix[][],int temp[][],int n){
for(int i =0;i<n;i++){
for(int j =0;j<n;j++)
	temp[i][j] = matrix[i][j];
}
}

static int[][] solve(int matrix[][],int n){
int k = 0;
int temp[][] = new int[n][n];
assign(matrix,temp,n);
while(k<n){
	if(recursive(matrix,temp,n,k))
		return temp;
	else
		assign(matrix,temp,n);
		
	
k++;
}



return temp;
}


static void print(int arr[][]){
for(int[] a : arr){
for(int i: a)
	System.out.print(i+" ");
System.out.println();
}
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int matrix[][] = new int[n][n];
for(int i =0;i<n;i++){
for(int j =0;j<n;j++){
matrix[i][j] = scan.nextInt();
}
}
int ans[][] = solve(matrix,n);
System.out.println("Ans : \n");
print(ans);
}
}