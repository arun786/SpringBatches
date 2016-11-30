package com.arun.bean;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Cricket")
public class Cricketer {

	private String name;
	private String country;
	private Double score;
	private Double nomatches;
	private Double average;

	@XmlElement(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement(name = "country")
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@XmlElement(name = "score")
	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	@XmlElement(name = "nomatches")
	public Double getNomatches() {
		return nomatches;
	}

	public void setNomatches(Double nomatches) {
		this.nomatches = nomatches;
	}

	@XmlElement(name = "average")
	public Double getAverage() {
		return average;
	}

	public void setAverage(Double average) {
		this.average = average;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cricketer [name=");
		builder.append(name);
		builder.append(", country=");
		builder.append(country);
		builder.append(", score=");
		builder.append(score);
		builder.append(", nomatches=");
		builder.append(nomatches);
		builder.append(", average=");
		builder.append(average);
		builder.append("]");
		return builder.toString();
	}

}
