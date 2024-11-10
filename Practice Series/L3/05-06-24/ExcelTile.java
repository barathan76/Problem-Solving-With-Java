import java.util.Scanner;
class ExcelTile{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
int n = str.length();
int ans = 0;
int z = n;
for(int i =0;i<n;i++){
int k = str.charAt(i) - 'A'+1;
int v = (--z)*26;
if(v == 0)
	v = 1;
ans = ans + k*v;
}
System.out.println(ans);
}
}