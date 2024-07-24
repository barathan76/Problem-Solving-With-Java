import java.util.Scanner;

class CrossSwap{
static void swap(int arr[][],int i,int k){
int temp = arr[i][k];
arr[i][k] = arr[k][i];
arr[k][i] = temp;
}

static boolean lexi(int matrix[][],int temp[][],int n,int k){
if(equals(matrix,temp,n))
	return false;

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
System.out.println(k);
for(int i =0;i<n;i++)
	swap(temp,i,k);
System.out.println();
print(temp);
if(lexi(matrix,temp,n,k))
	return true;


System.out.println();
for(int i =k+1;i<n;i++){
int sub[][] = getArray(temp,n);
System.out.println("Inner"+i);
System.out.println(i);
if(recursive(temp,sub,n,i)){
	System.out.println("found");
	return true;
}
else{
System.out.println("reassigning");
	assign(sub,temp,n);
}
}
}

return false;

}

static int[][] getArray(int temp[][],int n){
int ans[][] = new int[n][n];
for(int i =0;i<n;i++){
for(int j =0;j<n;j++){
ans[i][j] = temp[i][j];
}
}
return ans;
}

static void assign(int matrix[][],int temp[][],int n){
for(int i =0;i<n;i++){
for(int j =0;j<n;j++)
	temp[i][j] = matrix[i][j];
}
}

static boolean equals(int matrix[][],int temp[][],int n){
for(int i =0;i<n;i++){
for(int j =0;j<n;j++){
if(matrix[i][j] !=temp[i][j])
	return false;
}
}
return true;
}

static int[][] solve(int matrix[][],int n){
int k = 0;
int temp[][] = new int[n][n];
assign(matrix,temp,n);
while(k<n){
	System.out.println(k);
	if(recursive(matrix,temp,n,k)){
		return temp;
}
	else
		assign(matrix,temp,n);
System.out.println("Iteration ended");
		
	
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
if(equals(ans,matrix,n)){
	System.out.println("No solution found");return;
}
System.out.println("Ans : \n");
print(ans);
}
}