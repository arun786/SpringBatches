package com.arun.reader;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.arun.bean.Product;

public class ProductRowMapper implements FieldSetMapper<Product>{

	@Override
	public Product mapFieldSet(FieldSet fieldSet) throws BindException {
		Product prod = new Product();
		prod.setId(fieldSet.readString(0));
		prod.setName(fieldSet.readString(1));
		prod.setDescription(fieldSet.readString(2));
		prod.setPrice(fieldSet.readBigDecimal(3));
		return prod;
	}

}
