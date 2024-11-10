import java.util.Scanner;
class MinPair{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int t = scan.nextInt();
while(t>0){
int n = scan.nextInt();
int l = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++)
	arr[i] = scan.nextInt();
int min = Integer.MAX_VALUE;
for(int i =0;i<n;i++){
for(int j =i+1;j<n;j++){
	min = Math.min(min,Math.abs(arr[i]+arr[j] - l));
}
}
int count =0;
for(int i =0;i<n;i++){
for(int j =i+1;j<n;j++){
	if(Math.abs(arr[i]+arr[j] - l) == min)
		count++;
}
}
System.out.println(min+ " "+count);
t--;
}
}
}