
import java.io.File;

class FileRenameDeleteCreateDirectory{
public static void main(String args[]){
try{
File ogFile = new File(args[0]);
File reFile = new File(args[1]);
if(ogFile.renameTo(reFile)){
System.out.println("The file is successfully rename");
}
if(reFile.delete()){
System.out.println("The file is deleted");
}
File directory = new File(System.getProperty("user.dir") + File.separator +args[2]);
if(directory.mkdir()){
System.out.println("Directory created successfully");
}
}catch(ArrayIndexOutOfBoundsException e){
System.out.println(e);
}
}
}