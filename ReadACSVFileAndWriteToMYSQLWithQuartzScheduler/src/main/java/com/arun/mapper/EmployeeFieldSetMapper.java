package com.arun.mapper;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.amex.bean.Employee;

public class EmployeeFieldSetMapper implements FieldSetMapper<Employee> {

	@Override
	public Employee mapFieldSet(FieldSet fs) throws BindException {
		Employee emp = new Employee();
		emp.setId(fs.readString(0));
		emp.setName(fs.readString(1));
		emp.setSalary(fs.readInt(2));
		return emp;
	}

}
