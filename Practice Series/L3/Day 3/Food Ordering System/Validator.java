package authenticator;
import java.util.regex.Pattern;
public class Validator{

public  boolean emailValidator(String email){
String regex = "^(.+)@(\\S+)$";
return Pattern.compile(regex).matcher(email).matches();
}

public  boolean passwordValidator(String password){
String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8, 20}$";
return Pattern.compile(regex).matcher(password).matches();
}

}