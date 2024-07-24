import java.util.Scanner;
class Combinations{

static void solve(int arr[],int n,int len){

for(int i =0;i<len;i++)
	System.out.print(arr[i]);
System.out.println();

if(len == n)
	return;





if(len == 1){
int k = arr[0];
arr[1] = k-1;
arr[0] = 1;
solve(arr,n,len+1);
}
else{

for(int i = 0;i<len;i++){
if(arr[i] == 1)
	continue;
if(arr[i]>2){
	arr[i-1] = arr[i-1]+1;
	arr[i] = arr[i]-1;
	solve(arr,n,len);
}
else if(arr[i] == 2){
int k = arr[i+1];
arr[i] = 1;
arr[i+1] = 1;
arr[i+2] = k;
solve(arr,n,len+1);
}

}



}


}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[n+1];
arr[0] = n;
solve(arr,n,1);
}
}