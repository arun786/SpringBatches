package com.arun.processor;

import org.springframework.batch.item.ItemProcessor;

import com.arun.bean.Cricketer;

public class CricketerProcessor implements ItemProcessor<Cricketer, Cricketer>{

	@Override
	public Cricketer process(Cricketer item) throws Exception {
		Cricketer newItem = new Cricketer();
		newItem.setName(item.getName());
		newItem.setCountry(item.getCountry());
		newItem.setScore(item.getScore());
		newItem.setNomatches(item.getNomatches());
		newItem.setAverage(item.getScore()/item.getNomatches());
		return newItem;
	}

}
