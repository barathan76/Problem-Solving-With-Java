/* 6:54 - 6:24*/
import java.util.Scanner;
class Q7{
static int subString(String str,int i,int n){
if(n-i == 1)
	return str.charAt(i) - '0';
return (str.charAt(i)-'0')*10 + subString(str,i+1,n);
}
static int solve(String str){
int hour = 0,minutes = 0;
for(int i =0;i<str.length();i++){
if(str.charAt(i) == '.' || str.charAt(i) == ':'){
hour = subString(str,0,i);
minutes = subString(str,i+1,str.length());
break;
}
}
if(minutes == 0){
	if(hour*30-360 < 0)
		return 360 - hour*30;
	return hour*30 - 360;
}

int hourAngle = hour*30 + 30/(60/minutes);
int minuteAngle = (minutes/5)* 30;

/*if(hourAngle-minuteAngle<0)
	return minuteAngle-hourAngle;
*/
return Math.min(Math.abs(hourAngle-minuteAngle),Math.abs(360-minuteAngle+hourAngle));

	
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
System.out.println(solve(str));
}
}
/*
C:\Users\inc5540-32\Documents\Main test\L2\Test 4>java Q7
12:00
12,0
0

C:\Users\inc5540-32\Documents\Main test\L2\Test 4>java Q7
5:30
5,30
15

*/