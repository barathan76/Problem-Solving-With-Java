import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
class SortedArray{
static int[] solve(int a[],int b[],int n,int m){
Set<Integer> set = new TreeSet<Integer>();
for(int i =0;i<n;i++){
set.add(a[i]);
}
for(int j=0;j<m;j++){
set.add(b[j]);
}
int ans[] = new int[set.size()];
int k =0;
Iterator<Integer> iterate = set.iterator();
while(iterate.hasNext()){
ans[k] =iterate.next();
k++;
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
int m = scan.nextInt();
int arr1[] = new int[n];
for(int i =0;i<n;i++){
arr1[i] = scan.nextInt();
}
int arr2[] = new int[m];
for(int i =0;i<m;i++){
arr2[i] = scan.nextInt();
}
int ans[] = solve(arr1,arr2,n,m);
printArray(ans);
}
}