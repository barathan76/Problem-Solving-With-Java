import java.util.*;

class DungeonA {

    static class Point {
        int x, y;
        
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
    static int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; // Up, Down, Left, Right
    
    static boolean isValid(int x, int y, int rows, int cols) {
        return x >= 1 && x <= rows && y >= 1 && y <= cols;
    }
    
    static int bfs(int rows, int cols, Point start, Point end, char[][] grid) {
        Queue<Point> queue = new LinkedList<>();
        boolean[][] visited = new boolean[rows + 1][cols + 1];
        int[][] distance = new int[rows + 1][cols + 1];
        
        queue.offer(start);
        visited[start.x][start.y] = true;
        distance[start.x][start.y] = 0;
        
        while (!queue.isEmpty()) {
            Point current = queue.poll();
            
            if (current.x == end.x && current.y == end.y) {
                return distance[current.x][current.y];
            }
            
            for (int[] dir : directions) {
                int newX = current.x + dir[0];
                int newY = current.y + dir[1];
                
                if (isValid(newX, newY, rows, cols) && !visited[newX][newY] && grid[newX][newY] != 'P') {
                    queue.offer(new Point(newX, newY));
                    visited[newX][newY] = true;
                    distance[newX][newY] = distance[current.x][current.y] + 1;
                }
            }
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Dimensions of the dungeon(Row x Column): ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        
        char[][] grid = new char[rows + 1][cols + 1];
        
        System.out.print("Position of adventurer: ");
        int startX = scanner.nextInt();
        int startY = scanner.nextInt();
        
        System.out.print("Position of gold: ");
        int goldX = scanner.nextInt();
        int goldY = scanner.nextInt();
        
        // Initialize grid with 'O' (open space)
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                grid[i][j] = 'O';
            }
        }
        
        grid[startX][startY] = 'A'; // Place adventurer
        grid[goldX][goldY] = 'G';   // Place gold
        
        int minSteps = bfs(rows, cols, new Point(startX, startY), new Point(goldX, goldY), grid);
        
        if (minSteps == -1) {
            System.out.println("No possible solution");
        } else {
            System.out.println("Minimum number of steps: " + minSteps);
            
            // Optional: Print path
            List<Point> path = new ArrayList<>();
            Point current = new Point(goldX, goldY);
            path.add(current);
            
            while (current.x != startX || current.y != startY) {
                for (int[] dir : directions) {
                    int newX = current.x - dir[0];
                    int newY = current.y - dir[1];
                    
                    if (isValid(newX, newY, rows, cols) && grid[newX][newY] == 'A' && 
                        bfs(rows, cols, new Point(newX, newY), current, grid) == minSteps - path.size()) {
                        current = new Point(newX, newY);
                        path.add(current);
                        break;
                    }
                }
            }
            
            Collections.reverse(path);
            System.out.print("Path: ");
            for (Point p : path) {
                System.out.print("(" + p.x + "," + p.y + ") -> ");
            }
            System.out.println("(" + goldX + "," + goldY + ")");
        }
        
        scanner.close();
    }
}
