import java.util.Scanner;

class ColDelete {
   static int solve(String[] arr, int n) {
      int[][] matrix = new int[n][arr[0].length()];
      for(int i = 0; i < n; i++) {
         for(int j = 0; j < arr[0].length(); j++) {
            matrix[i][j] = arr[i].charAt(j);
         }
      }

	int count = 0;
      for(int i = 0; i < arr[0].length(); i++) {
         for(int j = 1; j < n; j++) {
            if (matrix[i][j] <= matrix[i - 1][j]) {
               count++;
               break;
            }
         }
      }

      return count;
   }

   public static void main(String[] var0) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      String[] arr = new String[n];
      scan.nextLine();

      for(int i = 0; i < n; i++) {
         arr[i] = scan.nextLine();
      }

      System.out.println(solve(arr, n));
   }
}