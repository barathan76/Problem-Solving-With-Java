package ContactManagementSystem;
import java.util.regex.Pattern;
class Validator{
void Validator(){
}
static boolean validateEmail(String email){
String regex = "^(.+)@(\\S+)$";
return Pattern.compile(regex).matcher(email).matches();
}

static boolean validatePhoneNumber(String phoneNumber){
String regex = "^[+]*[(]{0,1}[0-9]{1,4}[)]{0,1}[-\\s\\./0-9]*$";
return Pattern.compile(regex).matcher(phoneNumber).matches();
}
}