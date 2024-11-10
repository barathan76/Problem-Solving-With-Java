import java.util.Scanner;
class Cylinder{
static int recursive(int arr1[],int arr2[],int arr3[],int sum1,int sum2,int sum3,int i,int j,int k){
if(sum1 == sum2 && sum2 == sum3)
	return sum1;

if(i<0 || j<0 || k<0)
	return 0;
return Math.max(Math.max(recursive(arr1,arr2,arr3,sum1-arr1[i],sum2,sum3,i-1,j,k),recursive(arr1,arr2,arr3,sum1,sum2-arr2[j],sum3,i,j-1,k)),recursive(arr1,arr2,arr3,sum1,sum2,sum3-arr3[k],i,j,k-1));
}
static int solve(int arr1[],int arr2[],int arr3[],int l,int m,int n){
int sum1 = 0;
int sum2 = 0;
int sum3 = 0;
for(int i =l-1;i>=0;i--)
	sum1+=arr1[i];
for(int i =m-1;i>=0;i--)
	sum2+=arr2[i];
for(int i =n-1;i>=0;i--)
	sum3+=arr3[i];

return recursive(arr1,arr2,arr3,sum1,sum2,sum3,l-1,m-1,n-1);
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int l = scan.nextInt();
int m = scan.nextInt();
int n = scan.nextInt();
int arr1[] = new int[l];
int arr2[] = new int[m];
int arr3[] = new int[n];
for(int i =l-1;i>=0;i--)
	arr1[i] = scan.nextInt();
for(int i =m-1;i>=0;i--)
	arr2[i] = scan.nextInt();
for(int i =n-1;i>=0;i--)
	arr3[i] = scan.nextInt();
System.out.println(solve(arr1,arr2,arr3,l,m,n));
}
}