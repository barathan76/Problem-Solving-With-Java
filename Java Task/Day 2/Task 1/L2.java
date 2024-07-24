import java.util.ArrayList;
class Employee
{
String name;
int yoj;
String address;
Employee(String name, int yoj,String address)
{
this.name = name;
this.yoj = yoj;
this.address = address;
}
}

class Company
{
String companyName;
ArrayList<Employee> employees;

Company(String companyName)
{
this.companyName = companyName;
employees = new ArrayList<>();
}
void addEmployee(Employee employee)
{
employees.add(employee);
}

void displayEmployeeDetails()
{
System.out.format("%-10s %10s %20s","Name","Year of Joining", "Address");
System.out.println();
employees.forEach((e)-> {System.out.format("%-10s %10s %30s",e.name,e.yoj,e.address);
System.out.println();
});
}

}

class L2
{
public static void main(String args[])
{
Employee e1 = new Employee("Ashwin",1994,"64C-WallsStreet");
Employee e2 = new Employee("Robert",2000,"68D-WallsStreet");
Employee e3 = new Employee("John", 1999, "26B-WallsStreet");
Company company = new Company("Stark Industries");
company.addEmployee(e1);
company.addEmployee(e2);
company.addEmployee(e3);
company.displayEmployeeDetails();
}
}
