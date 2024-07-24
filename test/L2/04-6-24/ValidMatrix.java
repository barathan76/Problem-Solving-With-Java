import java.util.Scanner;
class ValidMatrix{
static boolean valid(int matrix[][] ,int n){
int sum = (n*(n+1))/2;
for(int i =0;i<n;i++){
int k = sum;
for(int j= 0;j<n;j++){
k-= matrix[i][j];
}
if(k !=0)
	return false;
}
for(int i =0;i<n;i++){
int k = sum;
for(int j= 0;j<n;j++){
k-= matrix[j][i];
}
if(k !=0)
	return false;
}



return true;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int matrix[][] = new int[n][n];
for(int i =0;i<n;i++){
for(int j = 0 ;j<n;j++){
matrix[i][j] = scan.nextInt();
}
}
System.out.println(valid(matrix,n));
}
}