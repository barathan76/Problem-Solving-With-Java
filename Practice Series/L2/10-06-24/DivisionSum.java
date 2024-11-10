import java.util.Scanner;
class DivisionSum{

static int recursive(int arr[],int i,int n,boolean flag){

if(i<0 || i>=n)
	return 1;


if(flag){
return arr[i]*recursive(arr,i+1,n,flag);
}
else
return arr[i]*recursive(arr,i-1,n,flag);
}

static int[] solve(int arr[],int n){
int ans[] = new int[n];
for(int i=0;i<n;i++){
ans[i] = recursive(arr,i-1,n,false) * recursive(arr,i+1,n,true);
}
return ans;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++){
arr[i] = scan.nextInt();
}
int ans[] = solve(arr,n);
for(int i =0;i<n;i++)
	System.out.println(ans[i]+" ");
}
}