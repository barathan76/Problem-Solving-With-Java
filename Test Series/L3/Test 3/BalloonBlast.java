/*5:03 - 6:00*/
import java.util.Scanner;
class BalloonBlast{
	
	static void printMatrix(char arr[][]){
		for(char row[] : arr){
			for( char c : row)
				System.out.print(c+" ");
			System.out.println();
		}
	}
	static boolean fillMatrix(char arr[][],int m,int n,int col, char c){
		boolean flag = true;
		for(int i = m-1;i>=0;i--){
			if(arr[i][col] == '-'){
				if(i == 0)
					flag = false;
				arr[i][col] = c;
				break;
			}
		}
		printMatrix(arr);
		if(flag)
			return true;
		else{
			System.out.println("Column is filled completely. Program is terminated");
			return false;
		}
	}
	
	
	static void colBurst(char arr[][],int m,int n){
	
		
		for(int i =0;i<n;i++){
				int start = -1;
				int count = 1;
			for(int j =1;j<m;j++){
				if(arr[j][i] == arr[j-1][i] && arr[j][i]!='-'){
					if(start == -1)
						start = j-1;
					count++;
				}else{
					count = 1;
					start = -1;
				}
			}
			if(count == 3){
				for(int j = start;j<start+3;j++){
					arr[j][i] = '-';
				}
				return;
			}
		}
	}
	static void rowBurst(char arr[][],int m,int n){
		
		for(int i =0;i<m;i++){
			int start = -1;
		int count = 1;
			for(int j =1;j<n;j++){
				if(arr[i][j] == arr[i][j-1] && arr[i][j]!='-'){
					if(start == -1)
						start = j-1;
					count++;
				}else{
					count = 1;
					start = -1;
				}
			}
			if(count == 3){
				for(int j = start-1;j<start+3;j++){
					arr[i][j] = '-';
				}
				return;
			}
		}
	}
	static boolean fullMatrix(char arr[][]){
	for(char row[] : arr){
			for( char c : row){
				if(c=='-') return false;
			}
		}
return true;		
	}
	static boolean fillMatrixV2(char arr[][],int m,int n,int col, char c){
		boolean flag = false;
		for(int i = m-1;i>=0;i--){
			if(arr[i][col] == '-'){
				arr[i][col] = c;
				flag = true;
				break;
			}else{
				for(int j = 0;j<n;j++){
					if(arr[i][j] == '-'){
						arr[i][j] = c;
						flag = true;
						break;
					}
				}
			}
				if(flag)
					break;
			}
			
		
		colBurst(arr,m,n);
		//rowBurst(arr,m,n);
		printMatrix(arr);
		
		if(fullMatrix(arr)){
			System.out.println("Matrix is full");
			return false;
		}
		return flag;
		}
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the matrix size(m*n)");
		int m = scan.nextInt();
		int n = scan.nextInt();
		char arr[][] = new char[m][n];
		for(int i =0;i<m;i++){
			for(int j =0;j<n;j++){
				arr[i][j] = '-';
			}
		}
		while(true){
			System.out.println("Enter the column number : ");
			int col = scan.nextInt();
			scan.nextLine();
			System.out.println("Enter the color of the balloon : ");
			char color = scan.next().charAt(0);
			if(!fillMatrixV2(arr,m,n,col-1,color))
				return;
			System.out.println("Do you wish to continue(Y/N): ");
			char c = scan.next().charAt(0);
			if(c != 'Y'){
			System.out.println("Program is terminated");
				return;
			}
		}
		
	}
}