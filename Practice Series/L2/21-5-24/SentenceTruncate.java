import java.util.Scanner;
class SentenceTruncate{

static String truncate(String str,int k){
String arr[] = str.split(" ");
StringBuilder builder = new StringBuilder();
int i;
for(i =0;i<k-1;i++){
builder.append(arr[i]+" ");
}
builder.append(arr[i]);
return builder.toString();
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String sentence = scan.nextLine();
int k = scan.nextInt();
System.out.println(truncate(sentence,k));
}
}