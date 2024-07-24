
class IdGenerator{
static String getUserId(String userName){
return userName.substring(0,4)+ (Math.random()*100);
}

static String getBookId(String bookName){
	return bookName.substring(0,4)+ (Math.random()*100);
}
}