import java.util.ArrayList;

class Person
{
protected String name;
protected int age;
public Person(String name, int age){
this.name = name;
this.age = age;
}
public String getName(){
return name;
}
public int getAge(){
return age;
}
}

class Doctor extends Person{
private String specialization;
public Doctor(String name,int age,String specialization) {
super(name,age);
this.specialization = specialization;
}
public String getSpecialization() {
return specialization;
}
}

class Patient extends Person{
private int patientID;
public Patient(String name,int age,int patientID) {
super(name,age);
this.patientID = patientID;
}
public int getPatientID() {
	return patientID;
}
}

class Hospital{
private String name;
private ArrayList<Doctor> doctors;
private ArrayList<Patient> patients;

public Hospital(String name) {
this.name = name;
doctors = new ArrayList<>();
patients = new ArrayList<>();
}

public void addDoctor(Doctor doctor){
doctors.add(doctor);
}
public void addPatient(Patient patient){
patients.add(patient);
}
public void displayDoctors(){
doctors.forEach((doctor)->System.out.println("Name : "+doctor.getName()+ ", Age : "+doctor.getAge()+ ", Specialization : "+doctor.getSpecialization()));
}
public void displayPatients(){
patients.forEach((patient)->System.out.println("Name : "+patient.getName()+", Age : "+patient.getAge()+", Patient ID : "+patient.getPatientID()));
}
}

class HospitalManagement{
public static void main(String args[])
{
Hospital hospital = new Hospital("ABC Hospital");
hospital.addDoctor(new Doctor("Dr. Smith", 45, "Cardiologist"));
hospital.addDoctor(new Doctor("Dr. Johnson", 50, "Pediatrician"));
Patient patient1 = new Patient("John Doe", 30, 1001);
Patient patient2 = new Patient("Jane Smith", 25, 1002);
hospital.addPatient(patient1);
hospital.addPatient(patient2);
hospital.displayDoctors();
hospital.displayPatients();
}
}
