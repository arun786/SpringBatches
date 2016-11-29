package com.arun.processor;

import org.springframework.batch.item.ItemProcessor;

import com.arun.bean.Cricketer;

public class CricketProcessor implements ItemProcessor<Cricketer, Cricketer>{

	@Override
	public Cricketer process(Cricketer item) throws Exception {
		Cricketer newItem = new Cricketer();
		Double score = item.getScore();
		Double matches = item.getNoMatches();
		Double average = score/matches;
		newItem.setName(item.getName());
		newItem.setCountry(item.getCountry());
		newItem.setNoMatches(item.getNoMatches());
		newItem.setScore(item.getScore());
		newItem.setAverage(average);
		return newItem;
	}

}
