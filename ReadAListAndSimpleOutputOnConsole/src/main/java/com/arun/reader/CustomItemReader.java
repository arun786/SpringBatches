package com.arun.reader;

import java.util.List;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

public class CustomItemReader implements ItemReader<String> {

	private List<String> listOfCricketers;
	private int count;

	public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		// TODO Auto-generated method stub
		return count < listOfCricketers.size() ? listOfCricketers.get(count++) : null;
	}

	public List<String> getListOfCricketers() {
		return listOfCricketers;
	}

	public void setListOfCricketers(List<String> listOfCricketers) {
		this.listOfCricketers = listOfCricketers;
	}
}
