class ZeroSum{
static Boolean zeroSum(int[] arr){
for(int i = 0;i<arr.length;i++){
int sum = 0;
for(int j = i;j<arr.length;j++){
sum+=arr[j];
if(sum == 0){
return true;
}
}
}
return false;
}

public static void main(String args[]){
int arr[] = { 1, 2, -2, 3, 4, 5, 6 };

System.out.print(zeroSum(arr));
}

}