import java.util.Scanner;
class SignFuncProduct{
static int signFunc(int x){
if(x>0)
	return 1;
else if(x<0)
	return -1;
else 
	return 0;
}
static int product(int arr[],int n){
int mul = 1;
for(int i =0;i<n;i++){
mul*=arr[i];
}
return signFunc(mul);
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);

int n = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++){
arr[i] = scan.nextInt();
}

System.out.println(product(arr,n));
}
}