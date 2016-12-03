package com.arun.bean;

public class Cricketer {
	private String name;
	private String country;
	private Double score;
	private Double nomatches;
	private Double average;

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

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}


	public Double getNomatches() {
		return nomatches;
	}

	public void setNomatches(Double nomatches) {
		this.nomatches = nomatches;
	}

	public Double getAverage() {
		return average;
	}

	public void setAverage(Double average) {
		this.average = average;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CricketMapper [name=");
		builder.append(name);
		builder.append(", country=");
		builder.append(country);
		builder.append(", score=");
		builder.append(score);
		builder.append(", noMatches=");
		builder.append(nomatches);
		builder.append(", average=");
		builder.append(average);
		builder.append("]");
		return builder.toString();
	}

}
