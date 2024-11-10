import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
class SubList{
static List<Integer> getList(int freq,int val){
List<Integer> list = new ArrayList<Integer>();
for(int i =0;i<freq;i++){
list.add(val);
}
return list;
}
static void solve(int arr[],int n){
if(n%2!=0){
System.out.println("The number of elements is not even");
return;
}
List<Integer> list = new ArrayList<Integer>();
for(int i = 0;i<n-1;i+=2){
list.addAll(getList(arr[i],arr[i+1]));
}
for(Integer i :list){
System.out.print(i+" ");
}
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.print("Enter the size of the array : ");
int n = scan.nextInt();
System.out.println("Enter the array elements................");
int arr[] = new int[n];
for(int i=0;i<n;i++){
arr[i] = scan.nextInt();
}
solve(arr,n);
}
}