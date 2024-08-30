import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
class Q3{
	public static void merge(int arr[],int low,int mid,int high){

	int l = mid-low+1;
	int r = high-mid;

	int left[] = new int[l];
	int right[] = new int[r];
	for(int i=0;i<l;i++)
		left[i] = arr[low+i];
	for(int j=0;j<r;j++)
		right[j] = arr[mid+1+j];

	int i =0,j=0;

	int k = low;

	while(i<l && j<r){

		if(left[i] <= right[j]){
			arr[k] = left[i];
				i++;
		}else{
			arr[k] = right[j];
				j++;
		}
		k++;
	}

		while(i<l){
			arr[k] = left[i];
				i++;
				k++;
			}

			while(j<r){
			arr[k] = right[j];
				j++;
				k++;
		}
}

	public static void sort(int arr[],int low,int high){
		if(low>=high)
			return;

		int mid = (low+high)/2;
		sort(arr,low,mid);
		sort(arr,mid+1,high);
		merge(arr,low,mid,high);
}
	public static int solve(int buses[],int passengers[],int n,int m,int c){
		int ans = 0;
		int j = 0;
		int k = 0;
		sort(buses,0,n-1);
		sort(passengers,0,m-1);
		for(int i =0;i<n;i++){
			Map<Integer,Integer> map = new HashMap<Integer,Integer>();
			k = j;
			while(j< m && passengers[j] < buses[i] && (j - k) < c ){
				map.put(passengers[j],1);
				j++;
			}
			int counter = 1;
			while(true){
				if(!map.containsKey(buses[i] - counter)){
					int count =0; 
					for(int l = j-1;l >=k;l--){
						if(passengers[l]< buses[i] - counter)
							count++;
					}
					if(count < c){
						ans = Math.max(ans,buses[i] - counter);
						break;
					}	
					}
				counter++;
			}
			}
		return ans;
	}
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		/*int buses[] = {10,20};
		int passengers[] = {2,17,18,19};
		int c = 2;*/
		int buses[] = {20,30,10};
		int passengers[] = {19,13,26,4,35,11,21};
		int c = 2;
		System.out.println(solve(buses,passengers,buses.length,passengers.length,c));
	}
}