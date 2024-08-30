import java.util.HashMap;
import java.util.Map;

public class Console {
    Map<String,Account> map;
    public boolean login(String email, String password){
        return map.containsKey(email) && map.get(email).password.equals(password);
    }
    Console(){
        map = new HashMap<String,Account>();
    }
    public void createAccount(String accountId,String userName,Props.Role role,String password,String email){
        Account account = new Account(accountId,userName);

    }

}
