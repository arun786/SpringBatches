package com.arun.processor;

import org.springframework.batch.item.ItemProcessor;

import com.arun.bean.Employee;

public class EmployeeItemProcessor implements ItemProcessor<Employee, Employee> {

	@Override
	public Employee process(Employee emp) throws Exception {
		if(emp.getSalary() > 1000){
			return emp;
		}
		
		return null;
	}

}
