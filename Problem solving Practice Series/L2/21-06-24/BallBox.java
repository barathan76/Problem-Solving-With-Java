import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
class BallBox{




static List<String> list = new ArrayList<String>();
static int perm = 0;
static int count = 0;

static void swap(int arr[],int i,int j){
int temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;
}
static void permutate(int arr[],int index,int n){

if(index == n-1){
if(list.contains(Arrays.toString(arr)))
	return;
list.add(Arrays.toString(arr));
perm++;
boolean flag = true;
for(int i =0,j=n/2; i<n/2 && j<n ; i++,j++){

for(int l = i+1, m = j+1; l<n/2 && m <n; l++,m++){
if(arr[i] == arr[l] || arr[j] == arr[m]){
	flag = false;
	break;
}
}
}
if(flag)
	count++;

return;
}

for(int i = index;i<n;i++){

swap(arr,index,i);
permutate(arr,index+1,n);
swap(arr,index,i);

}

}

static double solve(int arr[],int k){
int n = 0;
for(int i=0;i<k;i++)
	n+=arr[i];
int balls[] = new int[n];
int index = 0;
for(int i=0;i<k;i++){
for(int j =0;j<arr[i];j++){
balls[index++] = i+1;
}
}

permutate(balls,0,n);

System.out.println(perm);
System.out.println(count);

double ans = (double)count / (double) perm;

return ans;
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