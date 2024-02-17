package javaPLMun;

public class Employee {
	
	public String name;
	private String address;
	private double salary;
	private int age;
	
	public Employee(String empName) {
		name = empName;
	}
	
	public void Address(String empAdd) {
		address = empAdd;
	}
	
	public void setSalary(double empSalary) {
		salary = empSalary;
	}
	
	public void setAge(int empAge) {
		age = empAge;
	}
	
	public void printEmp() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Address: " + address);
		System.out.println("Salary: " + salary);
	}
	
	public static void main(String[] args) {
		
		Employee empOne = new Employee("Patricia");
		empOne.setSalary(5000);
		empOne.setAge(20);
		empOne.Address("Alabang");
		empOne.printEmp();
		
	}

}
