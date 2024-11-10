import java.util.Scanner;
class Stamp{

static boolean check(int matrix[][],int i,int j,int height,int width){

for(int k = i;k<i+height;k++){
for(int l = j;l<j+width;l++){
if(matrix[k][l] == 1)
	return false;
}
}
return true;
}


static void fillArray(int matrix[][],int i,int j,int height,int width){
for(int k = i;k<i+height;k++){
for(int l = j;l<j+width;l++){
	matrix[k][l] = 2;
}
}
}

/*static void printArray(int matrix[][],int n,int m){
for(int i=0;i<n;i++){
for(int j =0;j<m;j++){
System.out.print(matrix[i][j]);
}
System.out.println();
}
}
*/
static boolean checkfilled(int matrix[][],int n,int m){

for(int i=0;i<n;i++){
for(int j =0;j<m;j++){
if(matrix[i][j] == 0)
	return false;
}
}
return true;
}
static boolean solve(int matrix[][],int n,int m, int height, int width){
if(height>n && width>m)
	return false;

for(int i =0;i<=n-height;i++){
for(int j =0;j<=m-width;j++){
if(check(matrix,i,j,height,width)){
	fillArray(matrix,i,j,height,width);
}
}
}
return checkfilled(matrix,n,m);
}




public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int m = scan.nextInt();
int matrix[][] = new int[n][m];
for(int i = 0;i<n;i++){
for(int j = 0;j<m;j++){
matrix[i][j] = scan.nextInt();
}
}
System.out.println();
int height = scan.nextInt();
int width = scan.nextInt();
System.out.println(solve(matrix,n,m,height,width));
}
}