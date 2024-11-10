import java.util.Scanner;
class NumberClassify{
static void printNumberClassify(int arr[],int n){
int positive = 0;
int negative = 0;
int odd = 0;
int even = 0;
int zero = 0;
for(int i =0;i<n;i++){
int a = arr[i];
if(a>0)
	positive++;
else if(a<0)
	negative++;
else
	zero++;

if(a%2 == 0)
	even++;
else 
	odd++;
}
System.out.println("Number of positive numbers : "+positive+"\nNumber of Negative numbers : "+negative+"\nNumber of zeros : "+zero+"\nNumber of odd numbers : "+odd+"\nNumber of even numbers : "+even);

}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++){
arr[i] = scan.nextInt();
}
printNumberClassify(arr,n);
}
}