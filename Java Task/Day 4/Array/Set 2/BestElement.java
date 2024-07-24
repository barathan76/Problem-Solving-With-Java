class BestElement{
static int[] nextBest(int arr[]){
for(int i =0;i<arr.length-1;i++){
int val = arr[i+1];
for(int j = i+2;j<arr.length;j++){
val = Math.max(arr[j],val);
}
arr[i] = val;
}
arr[arr.length-1] = -1;
return arr;
}

public static void main(String args[]){
int arr[] = {1,2,3,4,5,6,7,8,9};
System.out.println("Array before operation :");
for(int i : arr){
System.out.print(i+" ");
}
System.out.println();
arr = nextBest(arr);
System.out.println("Array after operation :");
for(int i : arr){
System.out.print(i+" ");
}
System.out.println();
}
}