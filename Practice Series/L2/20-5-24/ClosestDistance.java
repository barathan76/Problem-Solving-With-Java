import java.util.Scanner;
class ClosestDistance{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[n];
int min = Integer.MAX_VALUE;
for(int i =0;i<n;i++){
arr[i] = scan.nextInt();
min = Math.min(min,Math.abs(arr[i]));
}
System.out.println(min);
}
}

