import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class SubArraySum{
static void printList(List<Integer> list){
for(int i:list)
	System.out.print(i+" ");

}
static List<Integer> subArray(int arr[],int n,int k){
for(int i =0;i<n;i++){
int sum = 0;
List<Integer> list = new ArrayList<Integer>();
for(int j =i;j<n;j++){
sum+=arr[j];
list.add(arr[j]);
if(sum>k)
	break;
if(sum == k)
	return list;
}
}
return new ArrayList<Integer>();
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++){
arr[i] = scan.nextInt();
}
System.out.println();
int k = scan.nextInt();
List<Integer> ans  = subArray(arr,n,k);
printList(ans);
}
}