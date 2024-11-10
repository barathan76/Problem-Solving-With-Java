import java.util.Scanner;
class Q7{
static void solve(int n){
	int arr[][] = new int[n][n];
	int a = 1;
int top = 0,bottom = n-1,left = 0,right = n-1;
while(left<=right && top<=bottom){
for(int i =left;i<=right;i++)
	arr[top][i] = (a++);
top++;

for(int i = top;i<=bottom;i++)
	arr[i][right] = (a++);	

right--;


if(bottom>=top)
{
	for(int i =right;i>=left;i--)
		arr[bottom][i] = (a++);
bottom--;
}

if(right>=left){
	for(int i =bottom;i>=top;i--)
		arr[i][left] = (a++);
left++;
}

}

for(int mat[] : arr){
	for(int i : mat)
		System.out.print(i +"\t");
	System.out.println();
}
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
solve(n);
}
}