import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
class Peak{
static void solve(int arr[],int n){
List<Integer> list = new ArrayList<Integer>();
for(int i= 1;i<n-1;i++){
if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1])
	list.add(arr[i]);
}
System.out.println(list);
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++)
	arr[i] = scan.nextInt();
solve(arr,n);
}
}