package system;
import user_repo.Customer;
import java.util.List;
public class UserProfileData{
List<Customer> customers;
public UserProfileData(){
DataFetcher fetcher = new DataFetcher();
customers = fetcher.getCustomerData();
}

public boolean checkUser(String email){
for(Customer c:customers)
	if(c.checkEmail(email))
		return false;
return true;
}
}