import java.util.Arrays;
class TwoSort{

static void twoSort(int a[],int b[]){
int arr[] = new int[a.length+b.length];
int k = 0;
for(int i =0;i<a.length;i++){
arr[k] =a[i];
k++;
}
for(int i = 0;i<b.length;i++){
arr[k] = b[i];
k++;
}

k = 0;
Arrays.sort(arr);

for(int i =0;i<a.length;i++)
{
a[i] = arr[k];
k++;
}
for(int i=0;i<b.length;i++){
b[i] = arr[k];
k++;
}
}
public static void main(String args[]){
int arr1[] = { 1, 5, 6, 7, 8, 10 };
int arr2[] = { 2, 4, 9 };

twoSort(arr1,arr2);
for(int i:arr1){
System.out.print(i);
}
System.out.println();
for(int i:arr2){
System.out.print(i);
}
}
}