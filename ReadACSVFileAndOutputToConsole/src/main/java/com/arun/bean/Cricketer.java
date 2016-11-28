package com.arun.bean;

public class Cricketer {
	private String name;
	private String country;
	private double runs;
	private String grade;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public double getRuns() {
		return runs;
	}

	public void setRuns(double runs) {
		this.runs = runs;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cricketer [name=");
		builder.append(name);
		builder.append(", country=");
		builder.append(country);
		builder.append(", runs=");
		builder.append(runs);
		builder.append(", grade=");
		builder.append(grade);
		builder.append("]");
		return builder.toString();
	}

}
