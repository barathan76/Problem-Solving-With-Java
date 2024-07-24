import java.util.Scanner;
class XMatrix{
static boolean valid(int arr[][],int n){

for(int i =0;i<n;i++){
if(arr[i][i]==0)
	return false;
else
	arr[i][i] = -1;
}
for(int i = 0,j = n-1;i<n && j>=0 ; i++,j--){
	if(arr[i][j] == 0)
		return false;
	else
		arr[i][j] = -1;
}
for(int i =0;i<n;i++){
for(int j =0;j<n;j++){
if(arr[i][j] == -1){
	continue;
}
if(arr[i][j]!=0)
	return false;
}
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