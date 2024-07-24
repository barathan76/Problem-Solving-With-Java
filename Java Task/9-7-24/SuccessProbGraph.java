import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Map.Entry;
class SuccessProbGraph{

static double solve(int edges[][],double prob[],int n,int start,int end){
Map<Integer,List<Integer>> map = new HashMap<>();
for(int i = 0;i<n;i++){
List<Integer> list = map.getOrDefault(edges[i][0], new ArrayList<Integer>());
list.add(edges[i][1]);
map.put(edges[i][0],list);
}




for(Entry<Integer,List<Integer>> entry : map.entrySet()){
System.out.println(entry.getKey()+ " "+entry.getValue());
}

return 0;


}

public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int edges[][] = new int[n][2];

for(int i =0;i<n;i++){
edges[i][0] = scan.nextInt();
edges[i][1] = scan.nextInt();
}
double prob[] = new double[n];

for(int i =0;i<n;i++)
	prob[i] = scan.nextDouble();
int start = scan.nextInt();
int end = scan.nextInt();
System.out.println(solve(edges,prob,n,start,end));
}



}