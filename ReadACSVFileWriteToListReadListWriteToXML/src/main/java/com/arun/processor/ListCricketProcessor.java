package com.arun.processor;

import org.springframework.batch.item.ItemProcessor;

import com.arun.bean.ClassCricketer;
import com.arun.bean.Cricketer;

public class ListCricketProcessor implements ItemProcessor<Cricketer, ClassCricketer>{

	public ClassCricketer process(Cricketer item) throws Exception {
		ClassCricketer c = new ClassCricketer();
		if(item.getGrade().equals("A")){
			c.setAward("Excellence");
			c.setName(item.getName());
			c.setCountry(item.getCountry());
		}else if(item.getGrade().equals("B")){
			c.setAward("Good");
			c.setName(item.getName());
			c.setCountry(item.getCountry());
		}
		return c;
	}
}
