package com.class17;

public class Employee {

	String employeeID;
	static String ceo="Sumair";
	int salary;
	
	public static void main(String[] args) {
		
		Employee emp1=new Employee();
		emp1.employeeID="hu123";
		emp1.salary=150000;
		
		Employee emp2=new Employee();
		emp2.employeeID="Ali456";
		emp2.salary=100000;
		
		
		System.out.println(emp1.employeeID+" * "+emp1.salary+" * "+ceo);

		System.out.println(emp2.employeeID+" * "+emp2.salary+" * "+ceo);
		
		
		
	}
	
	
}
