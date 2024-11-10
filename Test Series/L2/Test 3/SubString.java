
/*5:24 - 5:36*/
import java.util.Scanner;

class SubString{
	
static boolean recursive(String a,String b,int index,String current){
	if(current.equals(b))
		return true;
	if(index == a.length())
		return false;

	if(recursive(a,b,index+1,current+a.charAt(index)))
		return true;
	else if(recursive(a,b,index+1,current))
		return true;
	else
		return false;
	
}
static boolean solve(String s,String t){

if(s.length()>t.length())
	return recursive(s,t,0,"");
else
	return recursive(t,s,0,"");


}

public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String s = scan.nextLine();
String t = scan.nextLine();
System.out.println(solve(s,t));
}
}

/*

C:\Users\inc5540-32\Documents\Main test\L2\Test 3>java SubString
abc
ahbgdc
true

C:\Users\inc5540-32\Documents\Main test\L2\Test 3>java SubString
acb
ahbgdc
false

C:\Users\inc5540-32\Documents\Main test\L2\Test 3>java SubString
axc
ahbgdc
false

C:\Users\inc5540-32\Documents\Main test\L2\Test 3>java SubString
jalebi
jlb
true


*/