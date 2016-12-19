package com.arun.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.arun.bean.Product;

public class ProductRowMapper implements RowMapper<Product> {

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		Product p = new Product();
		p.setId(rs.getString(1));
		p.setName(rs.getString(2));
		p.setDescription(rs.getString(3));
		p.setPrice(rs.getBigDecimal(4));
		return p;
	}

}
