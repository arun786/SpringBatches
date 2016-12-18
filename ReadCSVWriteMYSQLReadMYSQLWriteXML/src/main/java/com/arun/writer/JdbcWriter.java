package com.arun.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.arun.bean.Product;

public class JdbcWriter extends NamedParameterJdbcDaoSupport implements ItemWriter<Product>, ProductDAO {

	private String INSERT_SQL = "insert into product(id,name,description,price) values(:id,:name,:description,:price)";
	private String UPDATE_SQL = "update product set name=:name, description=:description,price=:price where id=:id";

	@Override
	public void write(List<? extends Product> items) throws Exception {
		for (Product item : items) {
			insertOrUpdateProduct(item);
		}

	}

	@Override
	public void insertOrUpdateProduct(Product product) {

		SqlParameterSource sqlParameterSource = new MapSqlParameterSource("id", product.getId())
				.addValue("name", product.getName()).addValue("description", product.getDescription())
				.addValue("price", product.getPrice());
		int resp = 0;
		resp = this.getNamedParameterJdbcTemplate().update(INSERT_SQL, sqlParameterSource);
		if (resp == 0)
			this.getNamedParameterJdbcTemplate().update(UPDATE_SQL, sqlParameterSource);
	}

}
