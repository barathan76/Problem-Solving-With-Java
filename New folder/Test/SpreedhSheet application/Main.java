import java.util.Scanner;
class Main{
	public static void main(String args[]){
		SpreadSheetConsole console = new SpreadSheetConsole();
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println();
			System.out.println("------------------------------------------------------------------------");
			System.out.println("Welcome to SpreadSheet Application");
			System.out.println("Enter 1 to create a spreadSheet");
			System.out.println("Enter 2 to view all spreadSheet");
			System.out.println("Enter 3 to open a spreadSheet");
			System.out.println("Enter 4 to delete a spreadSheet");
			System.out.println("Enter 5 to exit...");
			System.out.println("------------------------------------------------------------------------");
			int n = scan.nextInt();
			scan.nextLine();
			switch(n){
				case 1 : console.createSheet();
						break;
				case 2: console.viewSheets();
						break;
				case 3: console.openSheet();
						break;
				case 4:console.deleteSheet();
						break;
				case 5:
				console.updateSheets();
						return;
				default:
						System.out.println("Invalid input");
			}
			
		}
	}
}