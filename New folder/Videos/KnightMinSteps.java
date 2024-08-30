import java.util.Scanner;
public class KnightMinSteps {

    static class Cell {
        int x, y, dist;

        public Cell(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }

    // Function to check if a given position is inside the board
    static boolean isInside(int x, int y, int N) {
        return (x >= 0 && y >= 0 && x < N && y < N);
    }

    // Function to find the minimum steps a Knight will take to reach target position
    static int minSteps(int N, int startX, int startY, int targetX, int targetY) {
        int[] dx = {-2, -1, 1, 2, -2, -1, 1, 2};
        int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};

        Cell[] queue = new Cell[N * N];
        boolean[][] visited = new boolean[N][N];
        int front = -1, rear = -1;

        queue[++rear] = new Cell(startX, startY, 0);
        visited[startX][startY] = true;

        while (front != rear) {
            Cell curr = queue[++front];

            if (curr.x == targetX && curr.y == targetY)
                return curr.dist;

            for (int i = 0; i < 8; i++) {
                int newX = curr.x + dx[i];
                int newY = curr.y + dy[i];

                if (isInside(newX, newY, N) && !visited[newX][newY]) {
                    visited[newX][newY] = true;
                    queue[++rear] = new Cell(newX, newY, curr.dist + 1);
                }
            }
        }

        return -1; // If target position cannot be reached
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
System.out.print("Enter the size of the chess board : ");
int n = scan.nextInt();
System.out.print("\nEnter the location of the knight : ");
int x= scan.nextInt();
int y= scan.nextInt();
System.out.print("\nEnter the target location : ");
int tx = scan.nextInt();
int ty = scan.nextInt();

        int minSteps = minSteps(n, x, y, tx, ty);
        if (minSteps != -1)
            System.out.println("Minimum steps required: " + minSteps);
        else
            System.out.println("Target position cannot be reached!");
    }
}

