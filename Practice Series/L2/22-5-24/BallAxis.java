import java.util.Scanner;
import java.util.Stack;
class BallAxis{
static int[] solve(int a[],int b[],int n){
Stack<Integer> stack = new Stack<Integer>();
Stack<Integer> indexStack = new Stack<Integer>();
for(int i =0;i<n;i++){
int e = a[i]*b[i];
if(e>0){
	stack.push(e);
	indexStack.push(i);}
else{
while(!stack.isEmpty() && stack.peek()>0 && stack.peek()<-e){
	stack.pop();
	indexStack.pop();}
if(stack.isEmpty() || stack.peek() <0 ){
	stack.push(e);
	indexStack.push(i);}
if(stack.peek() == -e){
	stack.pop();
	indexStack.pop();}
}
}
int[] ans = new int[indexStack.size()];
int i = indexStack.size()-1;
while(!indexStack.isEmpty())
	ans[i--] = indexStack.pop();
return ans;
}
static void printArray(int arr[]){
for(int i:arr){
System.out.print(i+ " ");
}
System.out.println();
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++){
arr[i] = scan.nextInt();
}
int strength[] = new int[n];
System.out.println();
for(int i =0;i<n;i++){
strength[i] =scan.nextInt();
}
int[] ans = solve(arr,strength,n);
printArray(ans);
}
}