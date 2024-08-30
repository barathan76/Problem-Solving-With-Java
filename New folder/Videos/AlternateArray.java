import java.util.Scanner;
import java.util.Queue;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
class AlternateArray{
static void print(List<Integer> list){
for(Integer i: list)
	System.out.print(i+ " ");
}
static boolean select(int arr[],int n){
int positive = 0;
int negative = 0;
for(int i =0;i<n;i++){
if(arr[i]>=0)
	positive++;
else if(arr[i]<0)
	negative++;
}
if(negative<positive)
	return true;
else 
	return false;
}
static List<Integer> solve(int arr[],int n){
boolean flag = select(arr,n);
List<Integer> list = new ArrayList<Integer>();
Queue<Integer> queue = new LinkedList<Integer>();
if(flag){
for(int i =0;i<n;i++){
	if(arr[i]>=0)
		queue.offer(arr[i]);
	else if(arr[i]<0){
		int k = queue.poll();	
		list.add(arr[i]);
		list.add(k);
}
}
}
else{
for(int i =0;i<n;i++){
	if(arr[i]<0)
		queue.offer(arr[i]);
	else if(arr[i]>=0){
		int k = queue.poll();	
		list.add(arr[i]);
		list.add(k);
}
}
}
while(!queue.isEmpty()){
int k = queue.poll();
list.add(k);
}
return list;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[n];
for(int i = 0;i<n;i++)
	arr[i] = scan.nextInt();
List<Integer> ans = solve(arr,n);
print(ans);
}
}