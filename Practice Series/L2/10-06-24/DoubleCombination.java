import java.util.Scanner;
class DoubleCombination{

static void printArray(int arr[]){
for(int i: arr)
	System.out.print(i+" ");
System.out.println();
}

static void rearrange(int arr[],int i,int n){

if(i>n){
printArray(arr);
return;
}


for(int j=0;j<2*n;j++){

if(arr[j] == -1 && j+i+1<2*n && arr[j+i+1] == -1){

arr[j] = i;
arr[j+i+1] = i;
rearrange(arr,i+1,n);
arr[j] = -1;
arr[j+i+1] = -1;
}
}
}





static void solve(int n){
int arr[] = new int[n*2];
for(int i =0;i<n*2;i++){
arr[i] = -1;
}
rearrange(arr,1,n);
}





public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
solve(n);
}
}