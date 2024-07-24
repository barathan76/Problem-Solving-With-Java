import java.util.Scanner;

class SumOfVowels{
static int solve(String str){
int i = 0,j = 0;
int total = 0;
int count = 0;
int n =str.length();
while(i<n && j<n){
if(isVowel(str.charAt(j))){
	count++;
	total+=count;
}
else
	total+=count;

if(j == n-1){
	count = 0;
	i++;
	j=i;
}
else
	j++;
}
return total;
}
static boolean isVowel(char c){
return (c == 'a'|| c=='e' || c == 'i'|| c=='o' || c == 'u'|| c=='A' || c == 'E'|| c=='I'|| c=='O' || c=='U');

}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
System.out.println(solve(str));
}
}