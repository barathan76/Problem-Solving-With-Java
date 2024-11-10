import java.util.Scanner;
class GregorianCalendar{

static boolean isLeapYear(int y){
if(y%4 == 0 || y%400 == 0 && y!=100)
	return true;

return false;
}
static int solve(String str){
String cal[] = str.split("-");
int year = Integer.parseInt(cal[0]);
int month = Integer.parseInt(cal[1]);
int day = Integer.parseInt(cal[2]);

if(month == 1)
	return day;

int ans = 0;

int month_calender[] = {31,28,31,30,31,30,31,31,30,31,30,31};
if(isLeapYear(year))
	month_calender[1] = 29;

for(int i =0;i<month-1;i++)
	ans+=month_calender[i];

ans+=day;

return ans;


}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
System.out.println(solve(str));
}
}