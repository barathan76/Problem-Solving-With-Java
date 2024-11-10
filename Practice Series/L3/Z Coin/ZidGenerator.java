package Services;
public class ZidGenerator{
public static String generate(String name,String hid){
return "Z"+name.hashCode()+"@"+hid.hashCode();
}
}