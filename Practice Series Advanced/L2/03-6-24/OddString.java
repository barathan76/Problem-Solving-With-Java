import java.util.Scanner;
class OddString{
static String generate(int n){
if(n%2 ==0){
String temp = "";
for(int i =0;i<n-1;i++)
	temp+="a";
return temp+"b";
}
else{
String temp = "";
for(int i =0;i<n;i++)
	temp+="a";
return temp;
}	
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
System.out.println(generate(n));
}
}