import java.util.Scanner;
class DeleteColumn{
static void print(char grid[][],int n ,int m){
for(int i =0;i<n;i++){
for(int j = 0;j<m;j++){
System.out.print(grid[i][j]);
}
System.out.println();
}
}
static int solve(char grid[][],int n,int m){
int count = 0;
for(int i = 0;i<m;i++){
char c = grid[0][i];
for(int j =1;j<n;j++){
if(grid[j][i]>=c){
c = grid[j][i];
}else{
count++;
break;
}
}
}
return count;

}
static int solution(String arr[],int n){
int m = arr[0].length();
char grid[][] = new char[n][m];
for(int i =0;i<n;i++){
for(int j =0;j<m;j++){
grid[i][j] = arr[i].charAt(j);
}
}

return solve(grid,n,m);
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.print("Enter the size of the array : ");
int n = scan.nextInt();
String arr[] = new String[n];
System.out.println("Enter the array elements : ");
scan.nextLine();
for(int i =0;i<n;i++){
arr[i] = scan.nextLine();
}
System.out.println("No of Columns need to be deleted is : "+solution(arr,n));

}
}