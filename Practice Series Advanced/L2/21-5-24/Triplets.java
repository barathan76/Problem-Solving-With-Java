import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
class Triplets{
static List<List<Integer>> solve(int arr[],int n){
List<List<Integer>> ans = new ArrayList<>();
Arrays.sort(arr);
for(int i =0;i<n;i++){
if(i>0 && arr[i] == arr[i-1])
	continue;
int j = i+1;
int k = n-1;
while(j<k){
int total = arr[i]+arr[j]+arr[k];
if(total>0)
	k--;
else if(total<0)
	j++;
else{
	List<Integer> subList = new ArrayList<Integer>();
	subList.add(arr[i]);
	subList.add(arr[j]);
	subList.add(arr[k]);
	ans.add(subList);
	j++;
	while(arr[j] == arr[j-1] && j<k)
		j++;
}
}
}
return ans;
}

static void printList(List<List<Integer>> list){
for(List<Integer> subList:list){
	for(Integer i: subList)
		System.out.print(i+" ");
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
List<List<Integer>> ans = solve(arr,n);
printList(ans);
}
}