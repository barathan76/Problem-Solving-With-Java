import java.util.Scanner;

import java.util.List;
import java.util.ArrayList;
import java.util.PriorityQueue;

class Pair implements Comparable<Pair>{
int data;
int distance;

public Pair(int data,int distance){
this.data = data;
this.distance = distance;
}

public int compareTo(Pair p){
if(this.data == p.data)
	return 0;
else if(this.data > p.data)
	return 1;
else
	return -1;
}
}

class Edge{
int vertex;
int distance;
public Edge(int vertex,int distance){
this.vertex = vertex;
this.distance =distance;
}
}

class Q1Dj{

public static int minDistDj(int arr[][],int n,int e){

int distance[] = new int[n];
for(int i =1;i<n;i++)
	distance[i] = Integer.MAX_VALUE;

List<List<Edge>> list = new ArrayList<>();

for(int i =0;i<n;i++)
	list.add(new ArrayList<Edge>());

for(int i =0;i<e;i++){
List<Edge> subList = list.get(arr[i][0]);
subList.add(new Edge(arr[i][1],arr[i][2]));
List<Edge> subList1 = list.get(arr[i][1]);
subList1.add(new Edge(arr[i][0],arr[i][2]));
}


PriorityQueue<Pair> queue = new PriorityQueue<Pair>();
queue.add(new Pair(0,0));

while(!queue.isEmpty()){
Pair p = queue.poll();
int i = p.data;
List<Edge> subList = list.get(i);
for(Edge j:subList){
if(distance[j.vertex]> distance[i]+ j.distance){
queue.add(new Pair(j.vertex,distance[i]+ j.distance));
distance[j.vertex] = distance[i]+ j.distance;
}
}
}


return distance[n-1];
}
public static int minDistance(int arr[][],int n,int e){

int distance[] = new int[n];
for(int i =1;i<n;i++)
	distance[i] = Integer.MAX_VALUE;

for(int j =1;j<n;j++){
for(int i = 0;i<e;i++){
if(distance[arr[i][0]]!=Integer.MAX_VALUE && distance[arr[i][0]] + arr[i][2]< distance[arr[i][1]])
	distance[arr[i][1]] = distance[arr[i][0]] + arr[i][2];
}
}

return distance[n-1];
}


static int count = 0;
public static int solve(int arr[][],int n,int e){
int minDist = minDistance(arr,n,e);

System.out.println(minDistDj(arr,n,e));
return minDist;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int e = scan.nextInt();
int arr[][] = new int[e][3];
for(int i =0;i<e;i++){
arr[i][0] = scan.nextInt();
arr[i][1] = scan.nextInt();
arr[i][2] = scan.nextInt();
}
System.out.println(solve(arr,n,e));
}
}