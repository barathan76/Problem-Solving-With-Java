import java.util.Scanner;
class SortArray{
static void swap(int arr[],int i,int j){
int temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;
}
static String solve(int arr[],int n){


int low = 0;
int high = n-1;
int mid = 0;
String ans = "";
while(mid<=high){

switch(arr[mid]){
case 0:
	swap(arr,low,mid);
	low++;
	mid++;
	break;
case 1:
	mid++;
	break;
case 2:
	swap(arr,mid,high);
	high--;
	break;

}

}

for(int i : arr)
	ans+=i+" ";
return ans;
}























/*String ans = "";
int queue1[] = new int[n];
int queue2[] = new int[n];
int queue3[] = new int[n];
int left1 = 0,left2 = 0,left3 = 0,right1= 0,right2=0,right3 = 0;
for(int i =0;i<n;i++){
if(arr[i] == 0)
queue1[right1++] = arr[i];

else if(arr[i] == 1)
queue2[right2++] = arr[i];

else if(arr[i] == 2)
queue3[right3++] = arr[i];
}

for(int i =left1;i<right1;i++)
	ans+= queue1[i]+" ";
for(int i =left2;i<right2;i++)
	ans+= queue2[i]+" ";
for(int i =left3;i<right3;i++)
	ans+= queue3[i]+" ";
return ans;

}	
*/
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++)
	arr[i] = scan.nextInt();
System.out.println(solve(arr,n));
}
}