package Account;
public interface Account{
public boolean signIn(String email,String password);
public boolean checkEmail(String email);
public String getName(String crypto);
public String getName();
public String getEmail(String crypto);
public String getPassword(String crypto);
}