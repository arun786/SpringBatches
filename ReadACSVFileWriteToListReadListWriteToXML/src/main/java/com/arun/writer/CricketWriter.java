package com.arun.writer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.batch.item.ItemWriter;

import com.arun.bean.Cricketer;

public class CricketWriter implements ItemWriter<Cricketer> {
	List<Cricketer> lst = new ArrayList<Cricketer>();

	public void write(List<? extends Cricketer> items) throws Exception {
		for (Cricketer c : items) {
			lst.add(c);
		}
	}

	public List<? extends Cricketer> getLst() {
		return lst;
	}
}
