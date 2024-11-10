import java.util.Scanner;
class Q5{
static void solve(int arr[],int n){
while(n>0){
for(int i =1;i<6;i++){
if(arr[i] == arr[i+1] && arr[i] == 0 && arr[i+1] == 1)
	arr[i] = 1;
else
	arr[i] = 0;
}
arr[7] = 0;
n--;
for(int i =0;i<8;i++)
	System.out.print(arr[i]+" ");
System.out.println();
}


}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int arr[] = new int[8];
for(int i =0;i<8;i++)
	arr[i] = scan.nextInt();
int n = scan.nextInt();
solve(arr,n);
for(int i =0;i<8;i++)
	System.out.print(arr[i]+" ");
System.out.println();
}
}