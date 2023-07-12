package day05.practice;


class Department {
	String deptName;
	int deptId;
	
	public Department(String deptName, int deptId) {
		this.deptName = deptName;
		this.deptId = deptId;
	}
}
class Student {
	String name;
	int id;
	Department department;
	
	// Create a constructor and assign depart and respective attributes
	// Add toString method to get the Student details.
	
	public Student(String name, int id,Department department) {
		this.name = name;
		this.id = id;
		this.department = department;
	}
	public void printStudentDetails() {
		System.out.println("Student Name: " + this.name);
		System.out.println("Student Id: " + this.id);
		System.out.println("Department Id: " + department.deptId);
	}
}
public class HasStudent {
	public static void main(String[] args) {
		
		Department department = new Department("IT",5);
		Student student = new Student("Paramu", 2,department);
		student.printStudentDetails();
	}
}
