class Leaders{
public static void main(String args[]){
int arr[] = {2,4,5,3,7,9,4};

for(int i =0;i<arr.length;i++){
int k = arr[i];
int j;
for(j =i+1;j<arr.length;j++){
if(k<arr[j]){
break;
}
if(j==arr.length - 1){
System.out.println("Leader : "+k);
}
}
}
}
}
