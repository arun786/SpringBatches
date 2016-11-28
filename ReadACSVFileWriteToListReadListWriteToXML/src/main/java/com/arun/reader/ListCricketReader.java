package com.arun.reader;

import java.util.List;

import org.springframework.batch.item.support.ListItemReader;

import com.arun.bean.Cricketer;
import com.arun.writer.CricketWriter;

public class ListCricketReader extends ListItemReader<Cricketer>{

	@SuppressWarnings("unchecked")
	public ListCricketReader(CricketWriter lst) {
		super((List<Cricketer>) lst.getLst());
	}
}
