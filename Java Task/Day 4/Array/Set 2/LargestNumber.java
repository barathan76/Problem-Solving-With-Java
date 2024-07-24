import java.util.Arrays;
import java.util.Collections;
class LargestNumber{

static void swap(int arr[],int i, int j)
{
arr[i] = arr[i] ^ arr[j];
arr[j] = arr[i] ^ arr[j];
arr[i] = arr[i] ^ arr[j];
}


static Boolean greatest(String a, String b){
int i =0,j = 0;
while(i<a.length() && j<b.length()){
if(a.charAt(i) == b.charAt(j)){
i++;
j++;
}else if(b.charAt(j)>a.charAt(i)){
return true;
}
else{
return false;
}
}
if(i<a.length()){
return false;
}
return true;
}



static void arraySort(int arr[]){
for(int i =0;i<arr.length;i++){
for(int j = i+1;j<arr.length;j++){
if(greatest(String.valueOf(arr[i]),String.valueOf(arr[j]))){
	swap(arr,i,j);
}
}
}
}

public static void main(String args[]){
int arr[] = {1, 2, 3, 0, 730, 97};
arraySort(arr);
for(int i =0;i<arr.length;i++){
System.out.print(arr[i]);
}
}
}