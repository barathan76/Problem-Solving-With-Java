import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;
class Graph{
private int vertices;
private int[][] adj;
private boolean visited[];
Graph(int vertices){
this.vertices = vertices;
this.adj = new int[vertices+1][vertices+1];
for(int[] row:adj)
	Arrays.fill(row,0);
this.visited = new boolean[vertices+1];

}
void clearHistory(){
Arrays.fill(visited,false);
}

void setEdge(int from,int to)
{
adj[from][to] = 1;
adj[to][from] = 1;
}
int getEdge(int from,int to)
{
return adj[from][to];
}

void Bfs(){
int a = 1;
TraverseBfs(a);
}
void TraverseBfs(int n){
Queue<Integer> queue = new LinkedList<Integer>();
visited[n] = true;
System.out.print(n+" ");
queue.add(n);
while(!queue.isEmpty()){
n = queue.poll();
for(int i =1;i<=vertices;i++){
if(adj[n][i] == 1){
if(!visited[i]){
visited[i] = true;
System.out.print(i+ " ");
queue.add(i);
}
}
}
}
}
void dfs(){
int a = 1;
TraverseDfs(a);
}

void TraverseDfs(int n){
visited[n] = true;
System.out.print(n+ " ");
for(int i =1;i<=vertices;i++){
if(adj[n][i] == 1){
if(!visited[i])
	TraverseDfs(i);
}
}
}
}
class GraphMain{
public static void main(String args[]){
Graph graph = new Graph(10);
graph.setEdge(2,7);
graph.setEdge(1,8);
graph.setEdge(3,4);
graph.setEdge(1,2);
graph.setEdge(5,10);
graph.setEdge(8,9);
graph.setEdge(6,2);
graph.setEdge(5,6);
graph.setEdge(7,3);
graph.Bfs();
System.out.println();
graph.clearHistory();
graph.dfs();
}
}