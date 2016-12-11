package com.arun.reader;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.arun.bean.Product;

public class ProductFieldSetMapper implements FieldSetMapper<Product> {

	@Override
	public Product mapFieldSet(FieldSet fieldSet) throws BindException {
		Product product = new Product();
		product.setId(fieldSet.readString(0));
		product.setName(fieldSet.readString(1));
		product.setDescription(fieldSet.readString(2));
		product.setPrice(fieldSet.readBigDecimal(3));
		return product;
	}

}
