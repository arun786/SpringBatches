package com.arun.processor;

import org.springframework.batch.item.ItemProcessor;

import com.arun.bean.Cricketer;

public class CricketProcessor implements ItemProcessor<Cricketer, Cricketer>{

	@Override
	public Cricketer process(Cricketer item) throws Exception {

		Cricketer newItem = new Cricketer();
		newItem.setName(item.getName());
		newItem.setCountry(item.getCountry());
		newItem.setNomatches(item.getNomatches());
		newItem.setScore(item.getScore());
		newItem.setAverage(item.getScore()/item.getNomatches());
		
		return newItem;
	}

}
