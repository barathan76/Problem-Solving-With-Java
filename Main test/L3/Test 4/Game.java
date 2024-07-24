package mechanics;
import components.Player;
import components.Monster;
import components.Point;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
public class Game{

public  int stage1(int m, int n, Point player, Point gold) {
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        boolean[][] visited = new boolean[m + 1][n + 1];
        Queue<Point> queue = new LinkedList<>();
        
        queue.add(new Point(player.x, player.y, 0));
        visited[player.x][player.y] = true;
        
        while (!queue.isEmpty()) {
            Point current = queue.poll();
            if (current.x == gold.x && current.y == gold.y) {
                return current.steps;
            }
            
            for (int[] direction : directions) {
                int i = current.x + direction[0];
                int j = current.y + direction[1];
                
                if (i > 0 && i <= m && j > 0 && j <= n && !visited[i][j]) {
                    visited[i][j] = true;
                    queue.add(new Point(i, j, current.steps + 1));
                }
            }
        }
        return -1;  
    }



public String stage2(int m, int n, Point player, Point monster, Point gold) {
    int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    boolean[][] visitedA = new boolean[m + 1][n + 1];
    boolean[][] visitedM = new boolean[m + 1][n + 1];
    Queue<Point> queueA = new LinkedList<>();
    Queue<Point> queueM = new LinkedList<>();
    
    queueA.add(new Point(player.x, player.y, 0));
    queueM.add(new Point(monster.x, monster.y, 0));
    visitedA[player.x][player.y] = true;
    visitedM[monster.x][monster.y] = true;
    
    while (!queueA.isEmpty()) {
        Point currentA = queueA.poll();
        if (currentA.x == gold.x && currentA.y == gold.y) {
            return "Minimum number of steps: " + currentA.steps;
        }
        
        if (!queueM.isEmpty()) {
            Point currentM = queueM.poll();
            for (int[] direction : directions) {
                int iM = currentM.x + direction[0];
                int jM = currentM.y + direction[1];
                
                if (iM > 0 && iM <= m && jM > 0 && jM <= n && !visitedM[iM][jM]) {
                    visitedM[iM][jM] = true;
                    queueM.add(new Point(iM, jM, currentM.steps + 1));
                }
            }
        }
        
        for (int[] direction : directions) {
            int iA = currentA.x + direction[0];
            int jA = currentA.y + direction[1];
            
            if (iA > 0 && iA <= m && jA > 0 && jA <= n && !visitedA[iA][jA] && !visitedM[iA][jA]) {
                visitedA[iA][jA] = true;
                queueA.add(new Point(iA, jA, currentA.steps + 1));
            }
        }
    }
    return "No possible solution";
}



public String stage3(int m, int n, Point player, Point monster, Point gold) {
    int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    boolean[][] visitedA = new boolean[m + 1][n + 1];
    boolean[][] visitedM = new boolean[m + 1][n + 1];
    Queue<Point> queueA = new LinkedList<>();
    Queue<Point> queueM = new LinkedList<>();
    Map<Point, Point> parentA = new HashMap<>();
    
    queueA.add(new Point(player.x, player.y, 0));
    queueM.add(new Point(monster.x, monster.y, 0));
    visitedA[player.x][player.y] = true;
    visitedM[monster.x][monster.y] = true;
    parentA.put(player, null);
    
    while (!queueA.isEmpty()) {
        Point currentA = queueA.poll();
        if (currentA.x == gold.x && currentA.y == gold.y) {
            List<Point> path = new ArrayList<>();
            for (Point at = currentA; at != null; at = parentA.get(at)) {
                path.add(at);
            }
            Collections.reverse(path);
            StringBuilder sb = new StringBuilder();
            sb.append("Minimum number of steps: ").append(currentA.steps).append("\nPath: ");
            for (Point p : path) {
                sb.append("(").append(p.x).append(",").append(p.y).append(") -> ");
            }
            sb.setLength(sb.length() - 4);
            return sb.toString();
        }
        
        if (!queueM.isEmpty()) {
            Point currentM = queueM.poll();
            for (int[] direction : directions) {
                int iM = currentM.x + direction[0];
                int jM = currentM.y + direction[1];
                
                if (iM > 0 && iM <= m && jM > 0 && jM <= n && !visitedM[iM][jM]) {
                    visitedM[iM][jM] = true;
                    queueM.add(new Point(iM, jM, currentM.steps + 1));
                }
            }
        }
        
        for (int[] direction : directions) {
            int iA = currentA.x + direction[0];
            int jA = currentA.y + direction[1];
            
            if (iA > 0 && iA <= m && jA > 0 && jA <= n && !visitedA[iA][jA] && !visitedM[iA][jA]) {
                visitedA[iA][jA] = true;
                Point nextA = new Point(iA, jA, currentA.steps + 1);
                queueA.add(nextA);
                parentA.put(nextA, currentA);
            }
        }
    }
    return "No possible solution";
}


public  String stage4(int m, int n, Point player, Point monster, Point trigger, Point gold) {
    int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    boolean[][] visitedA = new boolean[m + 1][n + 1];
    boolean[][] visitedM = new boolean[m + 1][n + 1];
    Queue<Point> queueA = new LinkedList<>();
    Queue<Point> queueM = new LinkedList<>();
    Map<Point, Point> parentA = new HashMap<>();
    
    queueA.add(new Point(player.x, player.y, 0));
    queueM.add(new Point(monster.x, monster.y, 0));
    visitedA[player.x][player.y] = true;
    visitedM[monster.x][monster.y] = true;
    parentA.put(player, null);
    
    boolean monsterAlive = true;
    
    while (!queueA.isEmpty()) {
        Point currentA = queueA.poll();
        
        if (currentA.x == gold.x && currentA.y == gold.y && !monsterAlive) {
            List<Point> path = new ArrayList<>();
            for (Point at = currentA; at != null; at = parentA.get(at)) {
                path.add(at);
            }
            Collections.reverse(path);
            StringBuilder sb = new StringBuilder();
            sb.append("Minimum number of steps: ").append(currentA.steps).append("\nPath: ");
            for (Point p : path) {
                sb.append("(").append(p.x).append(",").append(p.y).append(") -> ");
            }
            sb.setLength(sb.length() - 4);
            return sb.toString();
        }
        
        if (monsterAlive && !queueM.isEmpty()) {
            Point currentM = queueM.poll();
            for (int[] direction : directions) {
                int iM = currentM.x + direction[0];
                int jM = currentM.y + direction[1];
                
                if (iM > 0 && iM <= m && jM > 0 && jM <= n && !visitedM[iM][jM]) {
                    visitedM[iM][jM] = true;
                    queueM.add(new Point(iM, jM, currentM.steps + 1));
                }
            }
        }
        
        for (int[] direction : directions) {
            int iA = currentA.x + direction[0];
            int jA = currentA.y + direction[1];
            
            if (iA > 0 && iA <= m && jA > 0 && jA <= n && !visitedA[iA][jA] && (!monsterAlive || !visitedM[iA][jA])) {
                visitedA[iA][jA] = true;
                Point nextA = new Point(iA, jA, currentA.steps + 1);
                queueA.add(nextA);
                parentA.put(nextA, currentA);
                if (iA == trigger.x && jA == trigger.y) {
                    monsterAlive = false;
                    queueM.clear();
                }
            }
        }
    }
    return "No possible solution";
}


public String stage5(int m, int n, Point player, Point gold, List<Point> pits) {
    int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    boolean[][] visited = new boolean[m + 1][n + 1];
    Set<Point> pitSet = new HashSet<>(pits);
    Queue<Point> queue = new LinkedList<>();
    Map<Point, Point> parent = new HashMap<>();
    
    queue.add(new Point(player.x, player.y, 0));
    visited[player.x][player.y] = true;
    parent.put(player, null);
    
    while (!queue.isEmpty()) {
        Point current = queue.poll();
        
        if (current.x == gold.x && current.y == gold.y) {
            List<Point> path = new ArrayList<>();
            for (Point at = current; at != null; at = parent.get(at)) {
                path.add(at);
            }
            Collections.reverse(path);
            StringBuilder sb = new StringBuilder();
            sb.append("Minimum number of steps: ").append(current.steps).append("\nPath: ");
            for (Point p : path) {
                sb.append("(").append(p.x).append(",").append(p.y).append(") -> ");
            }
            sb.setLength(sb.length() - 4);
            return sb.toString();
        }
        
        for (int[] direction : directions) {
            int i = current.x + direction[0];
            int j = current.y + direction[1];
            Point next = new Point(i, j, current.steps + 1);
            
            if (i > 0 && i <= m && j > 0 && j <= n && !visited[i][j] && !pitSet.contains(next)) {
                visited[i][j] = true;
                queue.add(next);
                parent.put(next, current);
            }
        }
    }
    return "No possible solution";
}
public  String stage6(int m, int n, Point player, Point monster, Point gold, List<Point> pits) {
    int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    boolean[][] visitedA = new boolean[m + 1][n + 1];
    boolean[][] visitedM = new boolean[m + 1][n + 1];
    Set<Point> pitSet = new HashSet<>(pits);
    Queue<Point> queueA = new LinkedList<>();
    Queue<Point> queueM = new LinkedList<>();
    Map<Point, Point> parentA = new HashMap<>();
    
    queueA.add(new Point(player.x, player.y, 0));
    queueM.add(new Point(monster.x, monster.y, 0));
    visitedA[player.x][player.y] = true;
    visitedM[monster.x][monster.y] = true;
    parentA.put(player, null);
    
    while (!queueA.isEmpty()) {
        Point currentA = queueA.poll();
        if (currentA.x == gold.x && currentA.y == gold.y) {
            List<Point> path = new ArrayList<>();
            for (Point at = currentA; at != null; at = parentA.get(at)) {
                path.add(at);
            }
            Collections.reverse(path);
            StringBuilder sb = new StringBuilder();
            sb.append("Minimum number of steps: ").append(currentA.steps).append("\nPath: ");
            for (Point p : path) {
                sb.append("(").append(p.x).append(",").append(p.y).append(") -> ");
            }
            sb.setLength(sb.length() - 4);
            return sb.toString();
        }
        
        if (!queueM.isEmpty()) {
            Point currentM = queueM.poll();
            for (int[] direction : directions) {
                int iM = currentM.x + direction[0];
                int jM = currentM.y + direction[1];
                
                if (iM > 0 && iM <= m && jM > 0 && jM <= n && !visitedM[iM][jM]) {
                    visitedM[iM][jM] = true;
                    queueM.add(new Point(iM, jM, currentM.steps + 1));
                }
            }
        }
        
        for (int[] direction : directions) {
            int iA = currentA.x + direction[0];
            int jA = currentA.y + direction[1];
            Point nextA = new Point(iA, jA, currentA.steps + 1);
            
            if (iA > 0 && iA <= m && jA > 0 && jA <= n && !visitedA[iA][jA] && !visitedM[iA][jA] && !pitSet.contains(nextA)) {
                visitedA[iA][jA] = true;
                queueA.add(nextA);
                parentA.put(nextA, currentA);
            }
        }
    }
    return "No possible solution";
}

public String stage7(int m, int n, Point player, Point monster, Point trigger, Point gold, List<Point> pits) {
    int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    boolean[][] visitedA = new boolean[m + 1][n + 1];
    boolean[][] visitedM = new boolean[m + 1][n + 1];
    Set<Point> pitSet = new HashSet<>(pits);
    Queue<Point> queueA = new LinkedList<>();
    Queue<Point> queueM = new LinkedList<>();
    Map<Point, Point> parentA = new HashMap<>();
    
    queueA.add(new Point(player.x, player.y, 0));
    queueM.add(new Point(monster.x, monster.y, 0));
    visitedA[player.x][player.y] = true;
    visitedM[monster.x][monster.y] = true;
    parentA.put(player, null);
    
    boolean monsterAlive = true;
    
    while (!queueA.isEmpty()) {
        Point currentA = queueA.poll();
        
        if (currentA.x == gold.x && currentA.y == gold.y && !monsterAlive) {
            List<Point> path = new ArrayList<>();
            for (Point at = currentA; at != null; at = parentA.get(at)) {
                path.add(at);
            }
            Collections.reverse(path);
            StringBuilder sb = new StringBuilder();
            sb.append("Minimum number of steps: ").append(currentA.steps).append("\nPath: ");
            for (Point p : path) {
                sb.append("(").append(p.x).append(",").append(p.y).append(") -> ");
            }
            sb.setLength(sb.length() - 4);
            return sb.toString();
        }
        for (int[] direction : directions) {
            int iA = currentA.x + direction[0];
            int jA = currentA.y + direction[1];
            Point nextA = new Point(iA, jA, currentA.steps + 1);
            
            if (iA > 0 && iA <= m && jA > 0 && jA <= n && !visitedA[iA][jA] && (!monsterAlive || !visitedM[iA][jA]) && !pitSet.contains(nextA)) {
                visitedA[iA][jA] = true;
                queueA.add(nextA);
                parentA.put(nextA, currentA);
                if (iA == trigger.x && jA == trigger.y) {
                    monsterAlive = false;
                    queueM.clear();
                }
            }
        }
        if (monsterAlive && !queueM.isEmpty()) {
            Point currentM = queueM.poll();
            for (int[] direction : directions) {
                int iM = currentM.x + direction[0];
                int jM = currentM.y + direction[1];
                
                if (iM > 0 && iM <= m && jM > 0 && jM <= n && !visitedM[iM][jM]) {
                    visitedM[iM][jM] = true;
                    queueM.add(new Point(iM, jM, currentM.steps + 1));
                }
            }
        }
        
        
    }
    return "No possible solution";
}
}




/*Point gold;
Player player;
Monster monster;
Point trigger;
Point[] pits;
int m,n;

public void Game(Player player,Point gold,int m,int n){
this.player = player;
this.gold = gold;
this.m = m;
this.n = n;
}
public void Game(Player player,Point gold, Monster monster,int m,int n){
	this.player = player;
	this.gold = gold;
	this.monster = monster;
	this.m = m;
this.n = n;
}
public void Game(Player player, Point gold, Monster monster,Point trigger,int m,int n){
	this.player = player;
	this.gold = gold;
	this.monster = monster;
	this.trigger = trigger;
	this.m = m;
this.n = n;
}
public void Game(Player player, Point gold, Monster monster,Point trigger,Point[] pits,int m,int n){
	this.player = player;
	this.gold = gold;
	this.monster = monster;
	this.trigger = trigger;
	this.pits = pits;this.m = m;
this.n = n;
}*/


/*public void run(){
	int t = 0;
	if(monster == null && trigger == null){
		boolean visited[][] = new boolean[m+1][n+1];
		/*System.out.println(player.getCoord().getX() + " "+player.getCoord().getY());
			System.out.println(gold.getX() + " "+gold.getY());*/
		/*t = runWithoutMT();
	}else if(pits == null){
		t = runWithoutP();
	}else{
		t = runFull();
	}
	if(t == -1)
		System.out.println("No possible Solution, The player can't find gold or the player might be killed");
	else
		System.out.println("Mininum number of steps : "+t);
}

public int  runWithoutP(){
	return 0;
}
public int  runFull(){
	return 0;
}


*/


/*public int runWithoutMT(int i,int j,boolean visited[][]){
	if(i == gold.getX() && j == gold.getY())
		return 1;
	if(i<1 || i>m || j<1 || j>n  && visited[i][j])
		return Integer.MAX_VALUE;
	
	int x[] = {0,-1,0,1};
	int y[] = {-1,0,1,0};
	int min = Integer.MAX_VALUE;
	System.out.println(i+" "+j);
	
	for(int k =0 ;k<x.length;k++){
		visited[i][j] = true;
		min = Math.min(min,1+runWithoutMT(i+x[k],j+y[k],visited));
	}
	
	
	return min;
	
	
}*/