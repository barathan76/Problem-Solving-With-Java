import java.util.Scanner;
class GoalShift{
static String shift(String s){
char c[] = s.toCharArray();
char k = c[0];
for(int i =0;i<c.length-1;i++){
c[i]=c[i+1];
}
c[c.length-1] = k;
return String.valueOf(c);
}
static boolean solve(String s,String goal){
if(s.length()!=goal.length())
	return false;
for(int i =0;i<s.length();i++){
s =shift(s);
if(goal.equals(s))
	return true;
}
return false;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String s = scan.nextLine();
String goal = scan.nextLine();
System.out.println(solve(s,goal));
}
}