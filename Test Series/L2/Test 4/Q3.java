/*4:57 - 5:11*/
import java.util.Scanner;
class Q3{
	
	
static boolean check(String a,String b){
for(int i =0;i<a.length();i++){
boolean flag = false;
for(int j = 0;j<b.length();j++){
	if(a.charAt(i) == b.charAt(j)){
		flag = true;
		break;
	}
}
if(!flag)
		return false;
}
return true;
}
	
static String[] solve(String str){
	

String numbers[] = {"","one","two","three","four","five","six","seven","eight","nine","ten"};
String ans[] = new String[10];
int index = 0;
for(int i =1;i<numbers.length;i++){
	if(check(numbers[i],str)){
		ans[index] = numbers[i];
		index++;
	}	
}
String newAns[] = new String[index];

for(int i =0;i<index;i++){
	newAns[i] = ans[i];
}
ans = null;
return newAns;	
	
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
String ans[] = solve(str);
System.out.print("Possible Words in order: ");
for(int i =0;i<ans.length-1;i++)
	System.out.print(ans[i]+", ");
System.out.print(ans[ans.length-1]);

}
}

/*
C:\Users\inc5540-32\Documents\Main test\L2\Test 4>java Q3
entohig
Possible Words in order: one, eight, nine, ten
C:\Users\inc5540-32\Documents\Main test\L2\Test 4>java Q3
wonet
Possible Words in order: one, two, ten
C:\Users\inc5540-32\Documents\Main test\L2\Test 4>

*/