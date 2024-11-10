import java.util.Scanner;
class NegativeMatrix{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int matrix[][] = new int[n][n];
int count = 0;
for(int i =0;i<n;i++){
for(int j = 0 ;j<n;j++){
matrix[i][j] = scan.nextInt();
if(matrix[i][j]<0)
	count++;
}
}
System.out.println(count);
}
}