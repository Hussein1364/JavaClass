package com.mypakage;

public class EmployeeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeClass hussein=new EmployeeClass();
        hussein.id ="123";
        hussein.name="Hussein";
        hussein.department="IT";
        hussein.salary=180000;

        EmployeeClass salim=new EmployeeClass();
        salim.id ="123";
        salim.name="Hussein";
        salim.department="IT";
        salim.salary=180000;

        EmployeeClass[] employees=new EmployeeClass[2];
        employees[0]=hussein;
        employees[1]=salim;
        //write a for loop and print the values of employee objects and call the methods
		for(EmloyeeClass Emps:employees) {
			System.out.println("employdd id "+EmployeeClass.id);
		}
		
	}

}
