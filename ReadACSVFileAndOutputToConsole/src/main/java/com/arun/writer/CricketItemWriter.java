package com.arun.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

import com.arun.bean.Cricketer;

public class CricketItemWriter implements ItemWriter<Cricketer>{

	public void write(List<? extends Cricketer> items) throws Exception {
		System.out.println("List of Cricketers and there grades");
		System.out.println(items);
	}

}
