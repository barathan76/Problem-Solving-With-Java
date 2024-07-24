import java.util.Scanner;
class CountOne{
static int count(int matrix[][],int n,int m){
int count = 0;
for(int i =0;i<n;i++){
for(int j = 0;j<m;j++){
if(matrix[i][j] == 1)
	count++;
}
}
return count;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int m = scan.nextInt();
int matrix[][] = new int[n][m];
for(int i =0;i<n;i++){
for(int j = 0;j<m;j++){
matrix[i][j] = scan.nextInt();
}
}
System.out.println(count(matrix,n,m));
}
}