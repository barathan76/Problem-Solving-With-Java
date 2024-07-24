import java.util.Scanner;
class ArrayDuplicate{

static int[] duplicate(int arr[],int n){
int ans[] = new int[n*2];
for(int i =0;i<n;i++){
ans[i] = arr[i];
}
for(int i =0;i<n;i++){
ans[n+i] = arr[i];
}
return ans;
}


static void printArray(int arr[]){
for(int i:arr){
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

int ans[] = duplicate(arr,n);
printArray(ans);
}
}