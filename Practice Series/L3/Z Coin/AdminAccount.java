package Accounts;
class AdminAccount implements Account{
String email;
String password;
public boolean login(String email,String password){
return (this.email.equals(email) && this.password.equals(password));
}
}