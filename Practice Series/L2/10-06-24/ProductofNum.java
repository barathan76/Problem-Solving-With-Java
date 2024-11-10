import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class ProductofNum{
static int[] solve(int arr[],int n){
int ans[] = new int[n];
int mul = 1;
List<Integer> left = new ArrayList<Integer>();
List<Integer> right = new ArrayList<Integer>();

for(int i =1;i<n;i++){
right.add(arr[i]);
}

for(int i =0;i<n;i++){
int leftV = 1;
for(int j = 0;j<left.size();j++){
leftV *= left.get(j);
}

int rightV = 1;
for(int j =0;j<right.size();j++){
rightV*=right.get(j);
}
left.add(arr[i]);
if(right.size()!=0)
	right.remove(0);
ans[i] = leftV*rightV;
}

return ans;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++)
	arr[i] = scan.nextInt();
int ans[] = solve(arr,n);
for(int i =0;i<n;i++)
	System.out.println(ans[i]);
}
}