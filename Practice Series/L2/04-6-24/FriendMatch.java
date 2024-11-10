import java.util.Scanner;
class FriendMatch{
static boolean solve(String name, String typed){
int i = 0,j = 0;
int n = name.length();
int m = typed.length();
while(i<n && j<m){
	if(name.charAt(i) == typed.charAt(j)){
		i++;
		j++;
	}
	else if(i>0){
		if(name.charAt(i-1) == typed.charAt(j))
			j++;
		else 
			return false;
	}
}
return true;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String name = scan.nextLine();
String typed = scan.nextLine();
System.out.println(solve(name,typed));
}
}