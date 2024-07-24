import java.util.Scanner;
class Permutation
{


static void permutate(int arr[],int ans[],int index,int n){

if(index == n){
for(int i:ans)
	System.out.print(i+" ");
System.out.println();
return;
}


for(int i =0;i<arr.length;i++){
ans[index] = arr[i];

int rem[] = new int[arr.length-1];
int k = 0;
for(int j =0;j<arr.length;j++){
if(i == j)
	continue;
else
	rem[k++] = arr[j];
}
permutate(rem,ans,index+1,n);
}

}




public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++)
	arr[i] = scan.nextInt();

permutate(arr,new int[n],0,n);
}




}