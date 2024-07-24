import java.util.Scanner;
class MajorityElement{
static int solve(int arr[],int n){
int m = 0;
int count = 1;
for(int i =1;i<n;i++){

if(arr[m] == arr[i])
	count++;
else
	count--;
if(count == 0){
	m = i;
	count = 1;
}
}
count = 0;
for(int i  = 0;i<n;i++){
if(arr[i] == arr[m])
	count++;
}

if(count>n/2)
	return arr[m];
else
	return -1;

}
/*
for(int i =0;i<n;i++){
int count =1;
for(int j = i+1;j<n;j++){
if(arr[i] == arr[j])
	count++;
}
if(count >n/2)
	return arr[i];
}
return -1;
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