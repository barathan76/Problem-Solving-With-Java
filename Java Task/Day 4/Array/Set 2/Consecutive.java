
class Consecutive{
static int[] consecutive(int arr[]){
int start = 0;
int end = 0;
for(int i =0;i<arr.length;i++){
int check = arr[i] + 1;
for(int j =i+1;j<arr.length;j++){
if(arr[j] == check){
if(arr[i]>=arr[start]){
start = i;
end = j;
break;
}
}
}
}
int ans[] = new int[2];
ans[0] = start;
ans[1] = end;
return ans;
}
public static void main(String args[]){
int arr[] = { 2, 5, 0, 2, 1, 4, 3, 6, 1, 0 };
int range[] = consecutive(arr);
for(int i =range[0];i<=range[1];i++){
System.out.print(arr[i]);
}
}
}

