package com.arun.reader;

import java.util.List;

import org.springframework.batch.item.support.ListItemReader;

import com.arun.bean.Cricketer;
import com.arun.writer.CricketWriter;

public class CricketReaderForXML extends ListItemReader<Cricketer>{

	@SuppressWarnings("unchecked")
	public CricketReaderForXML(CricketWriter list) {
		super((List<Cricketer>) list.getLst());
	}
}
