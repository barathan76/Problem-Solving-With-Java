import java.util.List;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
class FileHandler{
	public static List<Account> getUserAccounts(){
	List<Account> list = new ArrayList<Account>();
	try(FileInputStream stream = new FileInputStream("user_account.dat");
	ObjectInputStream input = new ObjectInputStream(stream)){
		list = (List<Account>)input.readObject();
	}catch(IOException | ClassNotFoundException e){
		e.printStackTrace();
	}
	return list;
	}
	public static void setUserAccounts(List<Account> list){
		try(FileOutputStream stream = new FileOutputStream("user_account.dat");
		ObjectOutputStream output = new ObjectOutputStream(stream)){
			output.writeObject(list);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public List<Email> getUserEmails(String emailId){
		List<Email> email = new ArrayList<Email>();
		try(FileInputStream stream = new FileInputStream(emailId+".dat");
	ObjectInputStream input = new ObjectInputStream(stream)){
		email = (List<Email>)input.readObject();
	}catch(IOException | ClassNotFoundException e){
		e.printStackTrace();
	}
	return email;
	}
	public List<Email> getUserSentEmails(String emailId){
		List<Email> email = new ArrayList<Email>();
		try(FileInputStream stream = new FileInputStream(emailId+"sent.dat");
	ObjectInputStream input = new ObjectInputStream(stream)){
		email = (List<Email>)input.readObject();
	}catch(IOException | ClassNotFoundException e){
		e.printStackTrace();
	}
	return email;
	}
	public void sendEmail(Email email){
		List<Email> list = new ArrayList<Email>();
		try(FileInputStream stream = new FileInputStream((email.to.getEmail())+".dat");
		ObjectInputStream input = new ObjectInputStream(stream)){
		list = (List<Email>)input.readObject();
	}catch(IOException | ClassNotFoundException e){
		e.printStackTrace();
	}
	list.add(email);
	try(FileOutputStream stream = new FileOutputStream((email.to.getEmail())+".dat");
		ObjectOutputStream output = new ObjectOutputStream(stream)){
			output.writeObject(list);
		}catch(IOException e){
			e.printStackTrace();
		}
	try(FileInputStream stream = new FileInputStream((email.from.getEmail())+"sent.dat");
		ObjectInputStream input = new ObjectInputStream(stream)){
		list = (List<Email>)input.readObject();
	}catch(IOException | ClassNotFoundException e){
		e.printStackTrace();
	}
	list.add(email);
	try(FileOutputStream stream = new FileOutputStream((email.from.getEmail())+"sent.dat");
		ObjectOutputStream output = new ObjectOutputStream(stream)){
			output.writeObject(list);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
}