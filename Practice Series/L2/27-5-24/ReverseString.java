import java.util.Scanner;
class ReverseString{
static void reverse(char str[]){
for(int i =0,j=str.length-1;i<str.length/2 && j>=str.length/2;i++,j--){
	char c = str[i];
	str[i] = str[j];
	str[j] = c;
}
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
char str[] = scan.nextLine().toCharArray();
for(int i =0;i<str.length;i++)
	System.out.print(str[i]+ " ");

reverse(str);
System.out.println();
for(int i =0;i<str.length;i++)
	System.out.print(str[i]+ " ");
}
}