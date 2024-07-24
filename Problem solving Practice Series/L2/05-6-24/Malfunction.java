import java.util.Scanner;
class Malfunction{

static int solve(String str,String broke){
String[] arr = str.split(" ");
int count = 0;
boolean broken[] = new boolean[26];
for(char c : broke.toCharArray()){
broken[c - 'a'] = true;
}
for(String s : arr){
boolean flag = true;
for(char c : s.toCharArray()){
if(broken[c-'a']){
flag = false;
break;
}
}
if(flag == true)	
	count++;	
}
return count;
}

public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
String broke = scan.nextLine();
System.out.println(solve(str,broke));

}
}