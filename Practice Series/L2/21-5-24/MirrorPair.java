import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class MirrorPair{
static void printList(List<Integer[]> list){
int i;
for(i =0;i<list.size()-1;i++){
Integer a[] = list.get(i);
System.out.print("("+a[0]+","+a[1]+"),");
}
Integer a[] = list.get(i);
System.out.print("("+a[0]+","+a[1]+")");
}
static int reverseOfNum(int x){
String str = "";
while(x>0){
int k = x%10;
x = x/10;
str+=k;
}
return Integer.parseInt(str);
}
static List<Integer[]> solve(int a[],int b[],int n){
List<Integer[]> list = new ArrayList<Integer[]>();
for(int i =0;i<n;i++){
for(int j=0;j<n;j++){
int x = reverseOfNum(b[j]);
if(a[i] == x){
Integer k[] = new Integer[2];
k[0] = a[i];
k[1]  = b[j];
list.add(k);
}
}
}
return list;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arrA[] = new int[n];
int arrB[] = new int[n];
for(int i =0;i<n;i++){
arrA[i] = scan.nextInt();
}
System.out.println();
for(int i =0;i<n;i++){
arrB[i] = scan.nextInt();
}
List<Integer[]> list = solve(arrA,arrB,n);
printList(list);
}
}