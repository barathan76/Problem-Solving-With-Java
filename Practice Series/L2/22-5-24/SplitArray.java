import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
class SplitArray{
static List<Integer[]> solve(int arr[],int n){
int mid = n/2;
Integer a[],b[];
a = new Integer[mid];
b = new Integer[mid];
for(int i =0;i<mid;i++){
a[i] = arr[i];
}
for(int i=mid,j=0;i<n&&j<mid;i++,j++){
b[j] = arr[i];
}
List<Integer[]> list = new ArrayList<Integer[]>();
list.add(a);
list.add(b);
return list;
}

static void printListArray(List<Integer[]> list){
for(Integer[] a: list){
for(int i:a){
	System.out.print(i+" ");}
System.out.println();
}
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++){
arr[i] = scan.nextInt();
}
List<Integer[]> list = solve(arr,n);
printListArray(list);
}
}
