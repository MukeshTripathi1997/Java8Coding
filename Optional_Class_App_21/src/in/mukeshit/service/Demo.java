package in.mukeshit.service;

import in.mukeshit.beans.Employee;

public class Demo {
	public static void main(String[] args) {
		
		//EmployeeServcie service = new EmployeeService();
		if(emp!=null) {
			System.out.println(emp.getName());
		}
	Optional<Employee>empId=	service.getEmpById(101);
	if(empById.isPresent()) {
		Employee emp=empById.get();
		System.out.println(emp.getName);
	}
	else {
		System.out.println("With Given ID no record found");
		
	}
		Employee emp = service.getEmpById(101);
		System.out.println(emp.getName());

	}

}
