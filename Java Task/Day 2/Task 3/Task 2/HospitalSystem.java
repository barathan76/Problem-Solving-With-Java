class Person
{
String name;
String gender;
void display()
{
System.out.println("This is person");
}
}
class Doctor extends Person
{
void display()
{
System.out.println("This is doctor");
}
Doctor(String name,String gender)
{
super.name = name;
super.gender = gender;
}
}

class Patient extends Person
{
void display()
{
System.out.println("This is patient");
}
}

class HospitalSystem
{
public static void main(String args[])
{
Doctor doctor = new Doctor("Thanos","Male");
doctor.display();
}
}


