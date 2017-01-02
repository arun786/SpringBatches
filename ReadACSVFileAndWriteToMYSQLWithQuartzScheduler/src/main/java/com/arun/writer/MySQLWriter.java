package com.arun.writer;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.batch.item.ItemWriter;
import org.springframework.jdbc.core.JdbcTemplate;

import com.amex.bean.Employee;

public class MySQLWriter implements ItemWriter<Employee> {

	private JdbcTemplate jdbcTemplate;
	private final String INSERT_SQL = "insert into tcrmd00.employee (id,name,salary) values (?,?,?)";
	private final String UPDATE_SQL = "update tcrmd00.employee set name = ?,salary = ? where id =?";

	public MySQLWriter(DataSource ds) {
		jdbcTemplate = new JdbcTemplate(ds);
	}

	@Override
	public void write(List<? extends Employee> items) throws Exception {
		for (Employee item : items) {
			int response = jdbcTemplate.update(UPDATE_SQL, item.getName(), item.getSalary(), item.getId());
			if (response == 0) {
				jdbcTemplate.update(INSERT_SQL, item.getId(), item.getName(), item.getSalary());
			}
			System.out.println("items " + item.getId());
		}
	}
}
