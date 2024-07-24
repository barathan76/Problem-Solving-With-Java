import java.util.Scanner;
class SquareStick{

static boolean recursive(int arr[],int index,int top,int bottom,int left,int right,int target){

if(top == target && bottom == target && left == target && right == target)
	return true;
if(top > target || bottom > target || left > target || right> target)
	return false;

int val = arr[index];

if(recursive(arr,index-1,top+val,bottom,left,right,target))
	return true;
if(recursive(arr,index-1,top,bottom+val,left,right,target))
	return true;
if(recursive(arr,index-1,top,bottom,left+val,right,target))
	return true;
if(recursive(arr,index-1,top,bottom,left,right+val,target))
	return true;

return false;

}
static boolean solve(int arr[],int n){
int sum = 0;
for(int i : arr)
	sum+=i;
if(sum%4!=0)
	return false;
return recursive(arr,n-1,0,0,0,0,sum/4);
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