import java.io.Serializable;
interface Account extends Serializable{
boolean signIn(String email,String password);
void signUp(String name,String email,String password);
String getName();
String getEmail();
}