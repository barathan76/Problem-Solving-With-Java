import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class FactorSort{
static void printArray(int arr[]){
for(int i:arr){
System.out.print(i+" ");
}
}
static int[] solve(int arr[],int m,int n, int x){
int ans[] = new int[x];
List<Integer> list = new ArrayList<Integer>();
int k =0;
for(int i =0;i<x;i++){
if(m%arr[i] == 0){
	ans[k] = arr[i];
	k++;
}
else 
	list.add(arr[i]);
}
List<Integer> subList = new ArrayList<Integer>();
for(int i : list){
if(n%i==0){
	ans[k] = i;
	k++;
}
else 
	subList.add(i);
}
for(int i:subList){
ans[k] = i;
k++;
}
return ans;

}

public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int m = scan.nextInt();
int n = scan.nextInt();
int x = scan.nextInt();
int arr[] = new int[x];
for(int i =0;i<x;i++){
arr[i] = scan.nextInt();
}
int ans[] = solve(arr,m,n,x);
printArray(ans);
}
}