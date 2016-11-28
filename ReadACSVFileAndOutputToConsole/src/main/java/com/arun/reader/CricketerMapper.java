package com.arun.reader;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.arun.bean.Cricketer;

public class CricketerMapper implements FieldSetMapper<Cricketer>{

	public Cricketer mapFieldSet(FieldSet fieldSet) throws BindException {
		Cricketer crick = new Cricketer();
		crick.setName(fieldSet.readString(0));
		crick.setCountry(fieldSet.readString(1));
		crick.setRuns(fieldSet.readDouble(2));
		return crick;
	}

}
