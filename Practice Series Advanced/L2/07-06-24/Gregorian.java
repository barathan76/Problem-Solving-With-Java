import java.util.Scanner;
class Gregorian{
static boolean isLeapYear(String s){
int n = Integer.parseInt(s);
if(n%4 == 0 || n%400 == 0 && n%100!=0)
	return true;
else 
	return false;
}
static int solve(String str){
String[] arr = str.split("-");
int month[] = {31,28,31,30,31,30,31,31,30,31,30,31};
if(isLeapYear(arr[0]))
	month[1] = 29;
int m = Integer.parseInt(arr[1]);
int d = Integer.parseInt(arr[2]);

for(int i =0;i<m-1;i++){
d+=month[i];
}
return d;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);

String str = scan.nextLine();
System.out.println(solve(str));
}
}