import java.util.Arrays;

class MaxMinSort{
static int[] sort(int[] arr){
Arrays.sort(arr);
int ans[] = new int[arr.length];
int i =0;
int j = arr.length -1;
int k =0;
while(i<arr.length/2 && j>=arr.length/2 && k<arr.length){
ans[k] = arr[j];
ans[k+1] = arr[i];
i++;
k +=2;
j--;
}
if(arr.length%2 == 1){
ans[k] = arr[j];
}
return ans;
}
public static void main(String args[]){
int arr[] = {1,2,3,4,5,6,7,8,9};
System.out.println("Array before sort :");
for(int i : arr){
System.out.print(i+" ");
}
System.out.println();
arr = sort(arr);
System.out.println("Array after sort :");
for(int i : arr){
System.out.print(i+" ");
}
System.out.println();
}
}