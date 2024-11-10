import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
class DistinctArray{
static void print(List<List<Integer>> list){
for(List<Integer> subList : list){
for(int i : subList){
System.out.print(i+" ");
}
System.out.println();
}
}
static String convertArrayToString(int arr[],int n){
StringBuilder builder = new StringBuilder();
for(int i =0;i<n;i++){
builder.append(arr[i]);
}
return builder.toString();
}
static String convertListToString(List<Integer> list){
StringBuilder builder = new StringBuilder();
for(int i : list){
builder.append(i);
}
return builder.toString();
}
static String convertNestedListToString(List<List<Integer>> list){
StringBuilder builder = new StringBuilder();
for(List<Integer> subList : list){
builder.append(convertListToString(subList));
}
return builder.toString();
}

static Boolean permutate(String ans, List<List<Integer>> list, int l, int m){
if(l==m){
if(ans.equals(convertNestedListToString(list)))
	return true;
else 
	return false;
}
Boolean b = false;
for(int i = l;i<=m;i++){
Collections.swap(list, l, i); 
if(permutate(ans,list,l+1,m)){
b = true;
break;
}
Collections.swap(list, l, i);
}

return b;

}

static Boolean solve(int arr[], List<List<Integer>> list,int n,int m){
String ans = convertArrayToString(arr,n);
return permutate(ans,list,0,m-1);
}

public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.print("Enter the size of the first array : ");
int n = scan.nextInt();
System.out.println("Enter the array elements................");
int arr[] = new int[n];
for(int i=0;i<n;i++){
arr[i] = scan.nextInt();
}
System.out.println();
System.out.print("Enter the size of the second nested array : ");
int m = scan.nextInt();
List<List<Integer>> list = new ArrayList<>();
for(int i =0;i<m;i++){
System.out.println("Enter the no of elements in row "+(i+1));
int k = scan.nextInt();
System.out.println("Enter the elements of row "+(i+1));

List<Integer> subList = new ArrayList<Integer>();
for(int j =0;j<k;j++){
int temp = scan.nextInt();
subList.add(temp);
}
list.add(subList);
}

System.out.println(solve(arr,list,n,m));
}
}