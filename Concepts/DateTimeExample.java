import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.text.ParseException;
public class DateTimeExample{

public static void main(String args[]){

Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-YYYY");
try{
Date date = sdf.parse(str);
Calendar calendar = Calendar.getInstance();
calendar.setTime(date);
System.out.println(calendar.get(Calendar.YEAR));
}catch(ParseException e){
	e.printStackTrace();
}
}

}