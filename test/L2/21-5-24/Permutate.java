import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class Permutate{
static Boolean contains(int arr[],int i,List<Integer> list){
return list.contains(arr[i]);
}
static int max(List<List<Integer>> list){
int maxE = Integer.MIN_VALUE;
for(List<Integer> subList : list){
maxE = Math.max(subList.size(),maxE);
}
return maxE;
}


static int solve(int arr[],int n){
List<List<Integer>> list = new ArrayList<>();
for(int i =0;i<n;i++){
List<Integer> subList = new ArrayList<Integer>();
Boolean flag = false;
int k = i;
while(!flag){
subList.add(arr[k]);
k = arr[k];
flag = contains(arr,k,subList);
}
list.add(subList);

}
return max(list);
}




public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++){
arr[i] = scan.nextInt();
}
System.out.println(solve(arr,n));
}
}