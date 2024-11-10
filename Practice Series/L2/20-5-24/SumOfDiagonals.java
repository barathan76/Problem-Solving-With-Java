import java.util.Scanner;
class SumOfDiagonals{
static int sum(int arr[][],int n){
int j = n-1;
int sum = 0;
for(int i = 0;i<n && j>=0;i++,j--){
if(i != j){
sum+=arr[i][i]+arr[i][j];
}else{
sum+=arr[i][j];
}
}
return sum;

}
static void displayMatrix(int arr[][],int n){
System.out.println("Matrix .......");
for(int i =0;i<n;i++){
for(int j=0;j<n;j++){
System.out.print(arr[i][j]+" ");
}
System.out.println();
}

}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.print("Enter the square matrix dimension : ");
int n = scan.nextInt();
System.out.println();
System.out.println("Enter the element of the matrix ");
int matrix[][] = new int[n][n];
for(int i =0;i<n;i++){
for(int j=0;j<n;j++){
System.out.print("A "+i+" "+j+" : ");
matrix[i][j] = scan.nextInt();
System.out.println();
}
}
displayMatrix(matrix,n);
System.out.println("Sum of the matrix is : "+sum(matrix,n));
}
}