import java.util.Scanner;
class StringOperation{
static int solve(String arr[],int n){
int x = 0;
for(int i =0;i<n;i++){
if(arr[i].equals("--X") || arr[i].equals("X--"))
	x = x-1;
else if(arr[i].equals("++X") || arr[i].equals("X++"))
	x = x+1;
}
return x;
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