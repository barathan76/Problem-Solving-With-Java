class Student
{
String name;
int roll_no;
Student(String name,int roll_no)
{
this.name = name;
this.roll_no = roll_no;
}
}

class L1
{
public static void main(String args[])
{
Student s1 = new Student("John",2);
System.out.println("Name : "+s1.name+"\nRoll Number : "+s1.roll_no);
}
}
