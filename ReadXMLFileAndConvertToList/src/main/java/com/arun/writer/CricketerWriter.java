package com.arun.writer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.batch.item.ItemWriter;

import com.arun.bean.Cricketer;

public class CricketerWriter implements ItemWriter<Cricketer>{
	private List<Cricketer> lst = new ArrayList<Cricketer>();

	public void write(List<? extends Cricketer> items) throws Exception {
		for(Cricketer c : items){
			lst.add(c);
			//System.out.println(lst);
		}
		System.out.println(lst);
	}

	public List<Cricketer> getLst() {
		return lst;
	}
	
}
