import java.util.Arrays;
import java.util.Collections;
class LargestNumber{
static int[] largestNumber(Integer arr[]){
Arrays.sort(arr, Collections.reverseOrder());
int k = 0;
for(int i =0;i<arr.length;i++){
if(arr[i]<=0){
break;
}
k++;
}
int ans[] = new int[2];
ans[0] = 0;
ans[1] = k;
return ans;
}
public static void main(String args[]){
Integer arr[] = {1, 2, 3, 0, 4, 6};
int range[] = largestNumber(arr);
for(int i =range[0];i<=range[1];i++){
System.out.print(arr[i]);
}
}
}