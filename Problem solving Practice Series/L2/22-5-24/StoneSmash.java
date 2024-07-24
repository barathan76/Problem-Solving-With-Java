import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
class StoneSmash{
static int[] getMax(List<Integer> list){
int max = list.get(0);
int secondMax = list.get(0);
for(int i:list){
	if(i>max){
		secondMax = max;
		max = i;
	}
}
int[] ans = new int[2];
ans[0] = secondMax;
ans[1] = max;
return ans;
}
static int solve(int arr[],int n){
List<Integer> list = new ArrayList<Integer>();
for(int i =0;i<n;i++){
list.add(arr[i]);
}
while(list.size()>1){

int ans[] = getMax(list);
int y = ans[1];
int x = ans[0];

list.remove(new Integer(y));
list.remove(new Integer(x));
if(x!=y)
	list.add(y-x);
}
if(list.isEmpty())
	return 0;
else
	return list.get(0);
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