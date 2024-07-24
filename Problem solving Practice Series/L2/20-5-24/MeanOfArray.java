import java.util.Scanner;
import java.util.Arrays;
class MeanOfArray{
static float solution(int arr[],int n){
Arrays.sort(arr);
int a = (5*n)/100;
float sum = 0;
int count = n-(2*a);
for(int i =a;i<n-a;i++){
sum+=arr[i];
}
return sum/count;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.print("Enter the size of the array : ");
int n = scan.nextInt();
System.out.println("Enter the array elements................");
int arr[] = new int[n];
for(int i=0;i<n;i++){
arr[i] = scan.nextInt();
}

System.out.println(solution(arr,n));
}
}