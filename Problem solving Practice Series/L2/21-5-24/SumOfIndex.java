import java.util.Scanner;
class SumOfIndex{

static String IntToString(int x){
return x+"";
}
static Boolean check(int x,int a){
String str = IntToString(x);
if(str.contains(a+"")){
System.out.println(str);
return true;}
else 
return false;
}
static int solve(int arr[],int n,int a){
int count = 0;
for(int i =0;i<n;i++){
if(check(arr[i],a))
count+=i;
}
return count;
}

public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int a = scan.nextInt();
int n = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++){
arr[i] = scan.nextInt();
}
System.out.println(solve(arr,n,a));
}
}