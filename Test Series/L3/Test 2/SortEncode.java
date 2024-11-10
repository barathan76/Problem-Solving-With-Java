/*5:13 - 5:31*/
import java.util.Scanner;
class SortEncode{

static int getCode(char c){
int i = (int) c;
if(i>=97 && i<=122)
	return 0;
else if(i>=65 && i<=90)
	return 1;
return -1;
}

static void swap(char arr[],int i,int j){
char temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;
}
static String encode(String str){
int n = str.length();

char arr[] = str.toCharArray();
for(int i =0;i<n;i++){
int code = getCode(arr[i]);
for(int j =i+1;j<n;j++){
if(code == getCode(arr[j])){
	if(arr[i]>arr[j])
		swap(arr,i,j);
}
}
}


StringBuilder ans = new StringBuilder();

for(int i =0;i<n;i++)
	ans.append(arr[i]);

return ans.toString();

}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
System.out.println(encode(str));
}
}