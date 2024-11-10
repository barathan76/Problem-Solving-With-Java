package ContactManagementSystem;
class Contact{
private String name;
private String phoneNumber;
private String email;
private String companyName;
void setName(String name){
this.name = name;
}
String getName(){return name;
}
String getPhoneNumber(){
return phoneNumber;
}
boolean setPhoneNumber(String phoneNumber){
if(Validator.validatePhoneNumber(phoneNumber)){
	this.phoneNumber = phoneNumber;
	return true;}
else{
	System.out.println("Invalid phone Number ");
	return false;}
}
boolean setEmail(String email){
if(Validator.validateEmail(email)){
	this.email = email;
	return true;}
else{
	System.out.println("Invalid Email id,Set email again");
	return false;}
}
boolean setCompanyName(String companyName){
this.companyName = companyName;
return true;
}
boolean checkPhoneNumber(String phoneNumber){
return this.phoneNumber.equals(phoneNumber);
}
boolean equals(String name){
return this.name.equals(name);
}
boolean check(){
if(name!=null && email!= null && companyName !=null && phoneNumber !=null)
	return true;
else 
	return false;
}
}