import java.util.Scanner;
class BrickGrid{

static int dirs[][] = {{1,0},{-1,0},{0,1},{0,-1}};


static int[] hitBricks(int[][] grid, int[][] hits) {
       
        for(int i=0;i<hits.length;i++)
            if(grid[hits[i][0]][hits[i][1]] == 1)
                grid[hits[i][0]][hits[i][1]] = -1;
        
       
        for(int i=0;i<grid[0].length;i++)
            markAndCountStableBricks(grid, 0, i);
        
        int[] res = new int[hits.length];
        
        for(int i=hits.length-1;i>=0;i--){
            int row = hits[i][0];
            int col = hits[i][1];
            
            
            if(grid[row][col] == 0)
                continue;
            
            
            grid[row][col] = 1;
            
            if(!isStable(grid, row, col))
                continue;
			
			
            res[i] = markAndCountStableBricks(grid, hits[i][0], hits[i][1])-1; //Subtracting 1 from the total count, as we don't wanna include the starting restored brick
        }
        
        return res;
    }
static int markAndCountStableBricks(int[][] grid, int row, int col){
        if(grid[row][col] == 0 || grid[row][col] == -1)
            return 0;
        
        grid[row][col] = 2;
        int stableBricks = 1;
        for(int[] dir:dirs){
            int r = row+dir[0];
            int c = col+dir[1];
            
            if(r < 0 || r >= grid.length || c < 0 || c >= grid[0].length)
                continue;
            
            if(grid[r][c] == 0 || grid[r][c] == -1 || grid[r][c] == 2)
                continue;
            
            stableBricks += markAndCountStableBricks(grid, r, c);
        }
        
        return stableBricks;
    }
    
    static boolean isStable(int[][] grid, int row, int col){
        if(row == 0)
            return true;
        
        for(int[] dir:dirs){
            int r = row+dir[0];
            int c = col+dir[1];
            
            if(r < 0 || r >= grid.length || c < 0 || c >= grid[0].length)
                continue;
            
            if(grid[r][c] == 2)
                return true;
        }
        
        return false;
    }

public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int m = scan.nextInt();
int grid[][] = new int[n][m];
for(int i =0;i<n;i++){
for(int j =0;j<m;j++){
	grid[i][j] = scan.nextInt();	
}
}
System.out.println();
int l = scan.nextInt();
int hits[][] = new int[l][2];
for(int i = 0;i<l;i++){
for(int j =0;j<2;j++){
hits[i][j] = scan.nextInt();
}
}
int ans[] = hitBricks(grid,hits);
for(int i:ans)
	System.out.print(i+" ");
}
}