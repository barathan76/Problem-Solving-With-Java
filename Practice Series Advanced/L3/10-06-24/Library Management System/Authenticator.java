import java.util.List;
import java.util.ArrayList;
public class Authenticator{

List<User> adminUsers;
List<User> members;
public Authenticator(){
adminUsers = new ArrayList<User>();
members = new ArrayList<User>();

User user = new Admin();
user.signUp("thanos","thanos@123");
adminUsers.add(user);
User user1 = new Member("","","",0,"","",0);
user1.signUp("thanos","thanos@123");
members.add(user1);
}

public List<User> getAdminUsers(){
	return adminUsers;
}

public List<User> getMembers(){
	return members;
}


public void addMember(User user){
	members.add(user);
}

public boolean removeMember(String userId){
	
	if(members.size() == 0)
			return true;
	for(int i =0 ;i<members.size();i++){
		Member temp = (Member) members.get(i);
		if(temp.getUserId().equals(userId)){
			members.remove(i);
			return true;
		}
				
	}
	return false;
}






}