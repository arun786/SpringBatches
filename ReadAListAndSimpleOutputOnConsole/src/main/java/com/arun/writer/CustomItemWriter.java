package com.arun.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

public class CustomItemWriter implements ItemWriter<String>{

	public void write(List<? extends String> items) throws Exception {
		System.out.println(items);
	}

}
