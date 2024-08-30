import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
class SpreadSheetConsole{
	List<Sheet> sheets;
	Scanner scan = new Scanner(System.in);
	SpreadSheetConsole(){
		sheets = FileHandler.getSheets();
		if(sheets == null)
			sheets = new ArrayList<Sheet>();
	}
	public void updateSheets(){
		FileHandler.updateSheets(sheets);
	}	
	public void createSheet(){
		System.out.println("Enter the name of the sheet");
		String name = scan.nextLine();
		
		for(Sheet sheet : sheets){
			if(sheet.name.equals(name)){
				System.out.println("SpreadSheet with same name already exists");
				return;
			}
		}
		sheets.add(new Sheet(name));
		System.out.println("SpreadSheet Created successFully");
	}
	public void viewSheets(){
		for(Sheet sheet : sheets)
			System.out.println(sheet.name);
	}
	public void openSheet(){
		System.out.println("Enter the name of the sheet to open");
		String name = scan.nextLine();
		for(Sheet sheet : sheets){
			if(sheet.name.equals(name)){
				open(sheet);
				return;
			}
		}
		System.out.println("Can't able to open the sheet");
	}
	public void deleteSheet(){
		String name = scan.nextLine();
		int index = -1;
		for(int i =0;i<sheets.size();i++){
			Sheet sheet = sheets.get(i);
			if(sheet.name.equals(name)){
				index = i;
				break;
			}
		}
		if(index == -1){
			System.out.println("Invalid name");
			return;
		}
		sheets.remove(index);
		System.out.println("Sheet deleted Successfully");
	}
	public void open(Sheet sheet){
		while(true){
			System.out.println("-------------------------------------------------");
			System.out.println("Enter 1 to add a row");
			System.out.println("Enter 2 to delete a row");
			System.out.println("Enter 3 to add a column");
			System.out.println("Enter 4 to delete a column");
			System.out.println("Enter 5 to exit");
			System.out.println("-------------------------------------------------");
			int n = scan.nextInt();
			switch(n){
				case 1:
						sheet.addRow();
						break;
				case 2:
						System.out.println("Enter the index of the row to be deleted");
						int index = scan.nextInt();
						sheet.deleteRow(index-1);
						break;
				case 3:
						System.out.println("Select type");
						System.out.println("Enter 1 for Number");
						System.out.println("Enter 2 for Text");
						System.out.println("Enter 3 for Date");
						int t = scan.nextInt();
						Props.Type type = Props.Type.Number;
						switch(t){
							case 1:
								type = Props.Type.Number;
								break;
							case 2:
								type = Props.Type.Text;
								break;
							case 3:
								type = Props.Type.Date;
								break;
							default:
								System.out.println("Invalid input");
								return;
						}
						sheet.addColumn(type);
						break;
				case 4:
						System.out.println("Enter the index of the row to be deleted");
						int Colindex = scan.nextInt();
						sheet.deleteRow(Colindex-1);
						break;
				case 5:
					return;
				default:
						System.out.println("Invalid input");
			}
		}
	}
}