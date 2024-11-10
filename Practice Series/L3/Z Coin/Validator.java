package Services;
import java.util.regex.Pattern;
public class Validator{
public static boolean validateEmail(String email){
String regex = "^(.+)@(\\S+)$";
return Pattern.compile(regex).matcher(email).matches();
}

public static boolean validatePhoneNumber(String phoneNumber){
String regex = "^[+]*[(]{0,1}[0-9]{1,4}[)]{0,1}[-\\s\\./0-9]*$";
return Pattern.compile(regex).matcher(phoneNumber).matches();
}
public static boolean validatePassword(String password){
String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$";
return Pattern.compile(regex).matcher(password).matches();
}
}