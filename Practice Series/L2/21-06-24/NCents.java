import java.util.Scanner;
class Ncents{
static int count = 0;
static void recursive(int arr[],int m,int n,int i,int v){
if(v == n){
	count++;
	return;
}
if(i ==m || v>n){
return;
}
	

for(int j =i;j<m;j++){
v+=arr[j];
recursive(arr,m,n,j,v);
v-=arr[j];
}	
}


public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int m = scan.nextInt();
int arr[] = new int[m];
for(int i =0;i<m;i++)
	arr[i] = scan.nextInt();
recursive(arr,m,n,0,0);
System.out.println(count);
}
}