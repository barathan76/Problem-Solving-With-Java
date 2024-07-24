import java.util.Scanner;
class ZeroDuplicate{



static void shift(int arr[],int i,int n){
int temp = arr[i];
arr[i] = 0;
for(;i<n-1;i++){
int val = arr[i+1];
arr[i+1] = temp;
temp = val;
}
}



static void zeroShift(int arr[],int n){
for(int i =0;i<n-1;i++){
if(arr[i] == 0){
shift(arr,i+1,n);
i+=1;
}else{
continue;
}
}
}



static void print(int arr[]){
for(int i :arr){
System.out.print(i+" ");
}
}



public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++){
arr[i] = scan.nextInt();
}
zeroShift(arr,n);
print(arr);
}
}
