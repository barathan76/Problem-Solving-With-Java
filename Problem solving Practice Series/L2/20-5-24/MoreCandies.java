import java.util.Scanner;
class MoreCandies{
static String ConvertString(Boolean arr[]){
StringBuilder str = new StringBuilder();
for(Boolean b : arr){
str.append(b);
}
return str.toString();
}
static String result(int arr[],int n,int extra){
int max = Integer.MIN_VALUE;
for(int i:arr){
max = Math.max(max,i);
}
Boolean array[] = new Boolean[n];
for(int i =0;i<n;i++){
if(arr[i]+extra >= max){
array[i] = true;
}else{
array[i] = false;
}
}
return ConvertString(array);
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.print("Enter the size of the array : ");
int n = scan.nextInt();
System.out.println("Enter the array candies : ");
int candies[] = new int[n];
for(int i =0;i<n;i++){
candies[i] = scan.nextInt();
}
System.out.print("Enter the extraCandies : ");
int extra = scan.nextInt();
System.out.println(result(candies,n,extra));
}
}