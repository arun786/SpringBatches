package com.arun.processor;

import org.springframework.batch.item.ItemProcessor;

import com.arun.bean.Cricketer;

public class CricketItemProcessor implements ItemProcessor<Cricketer, Cricketer> {

	public Cricketer process(Cricketer item) throws Exception {

		if (item.getRuns() > 10000)
			item.setGrade("A");
		else if (item.getRuns() < 10000 && item.getRuns() > 5000)
			item.setGrade("B");
		else
			item.setGrade("C");

		return item;
	}

}
