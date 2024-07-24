import java.util.ArrayList;
import java.util.Scanner;
class Student
{
String name;
String rollNumber;
String phoneNumber;
String address;
Student(String name){
this.name = name;
}

void setRollNumber(String rollNumber)
{
this.rollNumber = rollNumber;
}
void setPhoneNumber(String PhoneNumber)
{
this.phoneNumber = phoneNumber;
}
void setAddress(String address)
{
this.address = address;
}
void displayDetails()
{
System.out.println("Name :"+name+"\nRoll Number :"+rollNumber+"\nPhone Number"+phoneNumber+"\nAddress : "+address);
}
}


class Section
{
ArrayList<Student> students;
Section()
{
students = new ArrayList<>();
System.out.println("hello there");
}

void addStudent(Student student)
{
students.add(student);
}

void displayStudentDetails(String name)
{
Boolean found = false;
students.forEach((student) -> { if(student.name.equals(name)){
student.displayDetails();
return;
}});
}

Boolean deleteStudent(String name){
for(Student student : students){
if(student.name.equals(name)){
return students.remove(student);
}
}
return false;
}

}



class L2_3
{
public static void main(String args[])
{
Section classA = new Section();
Scanner scan = new Scanner(System.in);
int n = 0;
while(n!=4){
System.out.println("1. Add Student to Class A");
System.out.println("2. Remove Student from Class A");
System.out.println("3. Get Student Details from Class A");
System.out.println("4. Exit");
System.out.print("Enter your choice : ");
n = scan.nextInt();
scan.nextLine();
switch(n)
{
case 1:
	System.out.println("Enter student name : ");
	String name = scan.nextLine();

	Student student = new Student(name);
	System.out.println("Enter Roll number : ");
	String rollno = scan.nextLine();
	student.setRollNumber(rollno);
	
	System.out.println("Enter phone number : ");
	String phoneNumber = scan.nextLine();
	student.setPhoneNumber(phoneNumber);
	System.out.println("Enter Address : ");
	String address = scan.nextLine();
	student.setAddress(address);
	classA.addStudent(student);
	System.out.println("Student Added successfully");
continue;
case 2:
	System.out.println("Enter student name : ");
	if(classA.deleteStudent(scan.nextLine()))
	{
		System.out.println("Student Removed Successfully");
}else{
	System.out.println("No Student found with the name to remove");
}
continue;
case 3:
	System.out.println("Enter student name to get the details : ");
	String getName = scan.nextLine();
	classA.displayStudentDetails(getName);
	continue;
case 4:
	return;
}
}
}
}
	

	



