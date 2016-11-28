package com.arun.processor;

import org.springframework.batch.item.ItemProcessor;

import com.arun.bean.Cricketer;

public class CricketerProcessor implements ItemProcessor<Cricketer, Cricketer>{

	public Cricketer process(Cricketer item) throws Exception {
		if(item.getScore() >  10000){
			item.setGrade("A");
		}else if(item.getScore() < 10000 && item.getScore() > 5000){
			item.setGrade("B");
		}else{
			item.setGrade("C");
		}
		return item;
	}

}
