import java.util.Scanner;
import java.util.Stack;
class SubSequence{
static int solve(int arr[],int n){
Stack<Integer> a = new Stack<Integer>();
Stack<Integer> b = new Stack<Integer>();
boolean flag = true;
for(int i = 0;i<n;i++){
if(flag){
if(a.isEmpty()){
	a.push(arr[i]);
	flag = false;
}
else if(!b.isEmpty()){
	if(b.peek()>arr[i]){
	a.push(arr[i]);
	flag = false;
}
}
}else{
if(arr[i]>a.peek()){
	b.push(arr[i]);
	flag = true;
}
}
}
return a.size()+b.size();
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++)
	arr[i] = scan.nextInt();
System.out.println(solve(arr,n));
}
}