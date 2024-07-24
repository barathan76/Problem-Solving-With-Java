import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
class ConsecutiveArray{

static Map<Integer,Integer> getFrequency(int arr[],int n){
Map<Integer,Integer> freqMap = new HashMap<Integer,Integer>();
for(int i =0;i<n;i++){
if(freqMap.containsKey(arr[i]))
	freqMap.put(arr[i],freqMap.get(arr[i])+1);
else
	freqMap.put(arr[i],1);
}
return freqMap;
}
static void swap(int[] arr, int i, int j)
{
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
}

static int partition(int[] arr, int low, int high)
{
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++){
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
}

static void quickSort(int[] arr, int low, int high)
{
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
}

static void printArray(int arr[]){
for(int i:arr)
	System.out.print(arr[i]+ " ");
System.out.println();
}
static Boolean checkArray(int arr[],int n){
quickSort(arr,0,n-1);
int i =0;
while(i<n-1){
if(arr[i+1]-arr[i] == 1)
	i++;
else
	return false;
}
return true;
}
static Boolean solve(int arr[],int n){
/*Map<Integer,Integer> map = getFrequency(arr,n);
int i =0;
while(i<n){
if(map.get(arr[i]) == 1)
	i++;
else 
	return false;
}
*/
return checkArray(arr,n);
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++){
arr[i] = scan.nextInt();
}
System.out.println(solve(arr,n));
}
}