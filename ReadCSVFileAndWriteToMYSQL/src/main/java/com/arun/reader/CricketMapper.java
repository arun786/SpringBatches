package com.arun.reader;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.arun.bean.Cricketer;

public class CricketMapper implements FieldSetMapper<Cricketer> {

	@Override
	public Cricketer mapFieldSet(FieldSet fieldSet) throws BindException {
		// TODO Auto-generated method stub
		Cricketer crick = new Cricketer();
		crick.setCountry(fieldSet.readString(1));
		crick.setName(fieldSet.readString(0));
		crick.setScore(fieldSet.readDouble(2));
		crick.setNomatches(fieldSet.readDouble(3));
		return crick;
	}

}
