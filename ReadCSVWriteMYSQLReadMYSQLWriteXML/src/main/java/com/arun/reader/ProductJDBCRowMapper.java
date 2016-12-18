package com.arun.reader;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.arun.bean.Product;

public class ProductJDBCRowMapper implements RowMapper<Product>{

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		Product prod = new Product();
		prod.setId(rs.getString(1));
		prod.setName(rs.getString(2));
		prod.setDescription(rs.getString(3));
		prod.setPrice(rs.getBigDecimal(4));
		return prod;
	}

}
