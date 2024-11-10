import java.util.Scanner;
class DiffArray{
static String solve(String arr[],int n){
int m = arr[0].length()-1;
int matrix[][] = new int[n][m];
for(int i =0;i<n;i++){
int sub[] = new int[m];
int k =0;
for(int j = 0;j<m;j++){
int d = arr[i].charAt(j+1) - arr[i].charAt(j);
sub[k] = d;
k++;
}
matrix[i] = sub;
}
int ans = 0;
for(int i =0;i<n-1;i++){
if(matrix[i][0] != matrix[i+1][0]){
if(i+1 == n-1)
	ans = i+1;
else
	ans = i;
}	
}

return arr[ans];
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);

int n = scan.nextInt();
scan.nextLine();
String arr[] = new String[n];
for(int i =0;i<n;i++)
	arr[i] = scan.nextLine();

System.out.println(solve(arr,n));
}

}