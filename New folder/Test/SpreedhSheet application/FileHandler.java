import java.util.List;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
class FileHandler{
	public static List<Sheet> getSheets(){
	List<Sheet> list = new ArrayList<Sheet>();
	try(FileInputStream stream = new FileInputStream("sheets.dat");
	ObjectInputStream input = new ObjectInputStream(stream)){
		list = (List<Sheet>)input.readObject();
	}catch(IOException | ClassNotFoundException e){
		e.printStackTrace();
	}
	return list;
	}
	public static void updateSheets(List<Sheet> list){
		try(FileOutputStream stream = new FileOutputStream("sheets.dat");
		ObjectOutputStream output = new ObjectOutputStream(stream)){
			output.writeObject(list);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
}