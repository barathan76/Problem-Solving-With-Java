public interface User{
public boolean signIn(String name,String password);
public void signUp(String name,String password);
public User getUser(String cryp);
public String getType();
}