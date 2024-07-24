import java.util.Scanner;
class InsertSpace{
static String solve(String str,int arr[],int n){
String ans = "";
int k = 0;
for(int i =0;i<n;i++){
for(;k<str.length;k++){
ans+=str.charAt(k);
if(i == k){
	ans+=" ";
	break;
}
}
}
return ans;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
int n = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++)
	arr[i] = scan.nextInt();
System.out.println(solve(str,arr,n));
}
}