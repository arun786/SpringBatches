package com.arun.writer;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.batch.item.ItemWriter;
import org.springframework.jdbc.core.JdbcTemplate;

import com.arun.bean.Product;

public class MYSQLWriter implements ItemWriter<Product> {

	private JdbcTemplate jdbcTemplate;
	private static final String INSERT_SQL = "insert into product (id,name,description,price) values(?,?,?,?)";
	private static final String UPDATE_SQL = "update product set name = ?, description = ?, price = ? where id = ?";

	public MYSQLWriter(DataSource ds) {
		jdbcTemplate = new JdbcTemplate(ds);
	}

	@Override
	public void write(List<? extends Product> items) throws Exception {

		for (Product item : items) {
			int result = jdbcTemplate.update(UPDATE_SQL, item.getName(), item.getDescription(), item.getPrice(),
					item.getId());

			if (result == 0) {
				jdbcTemplate.update(INSERT_SQL, item.getId(), item.getName(), item.getDescription(), item.getPrice());
			}
		}
	}

}
