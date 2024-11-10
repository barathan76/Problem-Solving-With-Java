import java.util.Scanner;
import java.util.Arrays;
class CommonCharacters{
static int[] countChars(String str){
int freq[] = new int[26];
for(char c:str.toCharArray())
	freq[c-'a']+=1;
return freq;
}


static int[] intersect(int freqA[],int freqB[]){

}
static String solve(String arr[],int n){
int freq[] = countChars(arr[0]);
for(int i =1;i<n;i++){
freq

for(int j =0;j<arr[i].length();j++){
int k = (int)arr.charAt(j);
if(freq[k] !=0){
if(freq
}
}
}
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
String arr[] = new String[n];
scan.nextLine();
for(int i =0;i<n;i++)
	arr[i] = scan.nextLine();
System.out.println(solve(arr,n));
}