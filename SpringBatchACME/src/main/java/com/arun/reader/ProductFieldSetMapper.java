package com.arun.reader;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.arun.bean.Product;

public class ProductFieldSetMapper implements FieldSetMapper<Product> {

	@Override
	public Product mapFieldSet(FieldSet fieldSet) throws BindException {
		Product prod = new Product();
		prod.setId(fieldSet.readString("PRODUCT_ID"));
		prod.setName(fieldSet.readString("NAME"));
		prod.setDescription(fieldSet.readString("DESCRIPTION"));
		prod.setPrice(fieldSet.readBigDecimal("PRICE"));
		return prod;
	}

}
