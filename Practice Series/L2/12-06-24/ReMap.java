import java.util.Scanner;
class ReMap{
static int solve(String str){
int max = Integer.MIN_VALUE;
int min = Integer.MAX_VALUE;

for(int i =0;i<str.length();i++){
String re = str.charAt(i)+"";
max = Math.max(Integer.parseInt(str.replaceAll(re,"9")),max);
min = Math.min(Integer.parseInt(str.replaceAll(re,"0")),min);
}

return max-min;

}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
System.out.println(solve(str));
}
}