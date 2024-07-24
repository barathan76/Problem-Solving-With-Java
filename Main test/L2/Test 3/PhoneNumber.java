/*5:37 - 6:07*/
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class PhoneNumber{
	
static void recursive(String arr[], String s,int index,List<String> list,String current){	
if(current.length() == s.length()){
	list.add(current);
	return;
}
if(index == s.length())
	return;
String str = arr[s.charAt(index)-'0'-1];
for(int i =0;i< str.length();i++){
recursive(arr,s,index+1,list,current+str.charAt(i));
}
}
static List<String> solve(String s){
List<String> list = new ArrayList<String>();
String arr[] = {"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
String str = arr[s.charAt(0)-'0'-1];
for(int i =0;i< str.length();i++){
recursive(arr,s,1,list,""+str.charAt(i));
}

return list;
}

public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String s = scan.nextLine();
System.out.println(solve(s));
}
}

/*
C:\Users\inc5540-32\Documents\Main test\L2\Test 3>java PhoneNumber
22
[aa, ab, ac, ba, bb, bc, ca, cb, cc]

C:\Users\inc5540-32\Documents\Main test\L2\Test 3>java PhoneNumber
23
[ad, ae, af, bd, be, bf, cd, ce, cf]
*/