import java.util.Scanner;
class NegativeShift{
static void printArray(int arr[]){
for(int i :arr){
System.out.print(i+" ");
}
System.out.println();
}

static void shift(int arr[],int i,int n){
int temp = arr[i];
for(int j =i;j<n-1;j++){
int k = arr[j+1];
arr[j] = k;
}
arr[n-1] = temp;
printArray(arr);
}


static int getLastPositive(int arr[],int n){
int index = 0;
for(int i =0;i<n;i++){
if(arr[i]>0)
	index = i;
}
return index;
}


static void solve(int arr[],int n){
int positive = getLastPositive(arr,n);
int i =0;
while(i<n){
if(arr[i]<0 && i<=positive){
	shift(arr,i,n);
	positive--;
}
else 
	i++;
}
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++){
arr[i] = scan.nextInt();
}
System.out.println("Before shift");
printArray(arr);
solve(arr,n);
System.out.println("After shift negative elements to the last of the array");
printArray(arr);
}
}
