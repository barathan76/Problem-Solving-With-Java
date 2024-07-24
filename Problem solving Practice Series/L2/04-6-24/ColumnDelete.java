import java.util.Scanner;
class ColumnDelete{
static int solve(String arr[],int n){
int count = 0;
for(int i =0;i<arr[0].length();i++){
for(int j = 1;j<n;j++){
if(arr[j].charAt(i)< arr[j-1].charAt(i)){
	count++;
	break;
}
}
}
return count;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
scan.nextLine();
String arr[] = new String[n];
for(int i =0;i<n;i++){
arr[i] = scan.nextLine();
}

System.out.println(solve(arr,n));
}
}