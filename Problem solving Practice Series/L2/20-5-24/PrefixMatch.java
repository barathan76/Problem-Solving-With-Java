import java.util.regex.Pattern;
import java.util.Scanner;
class PrefixMatch{
static Boolean match(String str, String regex){
return Pattern.compile(regex).matcher(str).matches();
}
static int count(String[] arr,int n, String prefix){
int count = 0;
for(int i =0;i<n;i++){
if(match(arr[i],prefix)){
count++;
}
}
return count;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.print("Enter the number of elements in the array : ");
int n = scan.nextInt();
scan.nextLine();
String arr[] = new String[n];
System.out.println("Enter the array elements ............");
for(int i =0;i<n;i++){
arr[i] = scan.nextLine();
}
System.out.println("Enter the prefix : ");
String prefix = scan.nextLine();
System.out.println("The number of strings in words that contain the prefix are : " + count(arr,n,prefix+".*"));

}
}