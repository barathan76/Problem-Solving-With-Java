import java.util.Scanner;
class LeastPossibleSum{
static int solve(int num){
String str = String.valueOf(num);
String str1 = "";
String str2 = "";
while(str.length()>0){
if(str.length() == 1){
str1+=str;
break;
}
else if(str.length() == 2){
str1+=str.charAt(0)- '0';
str2+=str.charAt(1)- '0';
break;
}
int min = Integer.MAX_VALUE;
int secondMin = Integer.MAX_VALUE;

for(int i =0;i<str.length();i++){
	min = Math.min(str.charAt(i)- '0',min);
}
str = str.replace(min+"","");
System.out.println(min);
System.out.println(str);
for(int i =0;i<str.length();i++){
    secondMin = Math.min(str.charAt(i)- '0',secondMin);
}
str = str.replace(secondMin+"","");
System.out.println(secondMin);
System.out.println(str);
str1+=min;
str2+=secondMin;
}
return Integer.parseInt(str1)+Integer.parseInt(str2);
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
System.out.println(solve(n));
}
}