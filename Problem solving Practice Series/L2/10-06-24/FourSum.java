import java.util.Scanner;
import java.util.Arrays;
class FourSum{

static void solve(int arr[],int n,int k){


int i =0,j = 1,l= n-2,m = n-1;

while(i<n-4 && j>i && l>j && m>l){
int sum = arr[i]+arr[j]+arr[l]+arr[m];
if(sum>k && l>j+1){
	l--;
	continue;
}
else if(sum<k && j<l-1){
	j++;
	continue;
}

if(k == sum){
	System.out.println("("+arr[i]+","+arr[j]+","+arr[l]+","+arr[m]+")");
	i++;
	j = i+1;
	l = n-2;
	m = n-1;
}

else if(l ==j+1){
m--;
}
}

}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++)
	arr[i] = scan.nextInt();

int k = scan.nextInt();
Arrays.sort(arr);
solve(arr,n,k);
}
}