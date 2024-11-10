import java.util.Scanner;
import java.util.Arrays;
class EqualPair{
public static Boolean solve(int arr[],int n){
Arrays.sort(arr);
Boolean flag = false;
for(int i =0;i<n-1;i+=2){
if(arr[i] == arr[i+1]){
flag = true;
}else{
return false;
}
}
return flag;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++){
arr[i] = scan.nextInt();
}
System.out.println(solve(arr,n));
}
}
