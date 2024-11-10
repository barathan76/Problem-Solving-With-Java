import java.util.Scanner;
class ClosestDistance{
static int min(int a,int b){
if(a<b)
	return a;
else 
	return b;
}
static int closestDistance(int arr[],int n){
int minDist = Integer.MAX_VALUE;
for(int i =0;i<n;i++){
if(arr[i]<0)
	minDist = min(minDist,-arr[i]);
else	
	minDist = min(minDist,arr[i]);
}
return minDist;
} 


public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++){
arr[i] = scan.nextInt();
}
System.out.println(closestDistance(arr,n));
}
}