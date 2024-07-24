import java.util.Arrays;
class SortOperations
{
public static void main(String args[])
{
int array[] = {3,4,7,8,99,22};
System.out.println("Int array before sort");
for(int i:array){
System.out.print(i+" ");}
System.out.println();

Arrays.sort(array);

System.out.println("Int array after sort");
for(int i:array){
System.out.print(i+" ");}
System.out.println();

String arr[] = {"thanos","ironMan","captainAmerica","thor"};


System.out.println("String array before sort");
for(String i:arr){
System.out.print(i+" ");}
System.out.println();


Arrays.sort(arr);

System.out.println("String array after sort");
for(String i:arr){
System.out.print(i+" ");}
System.out.println();
}
}
