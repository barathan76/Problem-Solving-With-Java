import java.util.Scanner;

class Survive{
static int solve(int arr[],int n,int v){
int h = v;
int count = 0;
int i =0;
while(i<n){
if(h == 1){
h+=arr[i];
count++;
}else if(h>(n-i)){
System.out.print("health:"+h+" at day "+i+" since health is normal\n");
return count;
}else if(h+arr[i] > (n-i)){
System.out.print("health:"+h+" at day "+i+" since health is not normal\n");
count++;
return count;
}
else{
h--;
}
System.out.print("health:"+h+" at end of day "+i+"\n");
i++;
}

return count;
}
static void print(int arr[],int n){
for(int i =0;i<n;i++){
System.out.print(arr[i]+" ");
}
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int v = scan.nextInt();

int arr[] = new int[n];
for(int i =0;i<n;i++){
arr[i] = scan.nextInt();
}
System.out.println(solve(arr,n,v));
}
}
