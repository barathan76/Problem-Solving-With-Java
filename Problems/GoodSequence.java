import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
class GoodSequence{

public static void getSubSequences(int arr[],int n,List<List<Integer>> list,int index,List<Integer> subList){

if(index == n){
list.add(new ArrayList<Integer>(subList));
return;
}
subList.add(arr[index]);
index++;

getSubSequences(arr,n,list,index,subList);
subList.remove(subList.size()-1);
getSubSequences(arr,n,list,index,subList);
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++)
	arr[i] = scan.nextInt();
List<List<Integer>> list  = new ArrayList<>();
getSubSequences(arr,n,list,0,new ArrayList<Integer>());
for(List<Integer> l : list){
System.out.print("list: ");
	for(int i : l)
		System.out.print(i+ " ");
System.out.println();
}
}

}