import java.util.Scanner;
class InsertSpace{
static String solve(String str,int arr[],int n){
String ans = "";
int k = 0;
for(int i =0;i<n;i++){
while(k<str.length()){
if(arr[i] == k){
	ans+=" ";
	break;
}
ans+=str.charAt(k);
k++;
}
}
while(k<str.length()){
	ans+=str.charAt(k);
	k++;
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