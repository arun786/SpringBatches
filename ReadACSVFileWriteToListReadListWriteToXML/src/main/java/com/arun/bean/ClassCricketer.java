package com.arun.bean;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Cricketer")
public class ClassCricketer {
	
	private String name;
	private String country;
	private String award;

	@XmlElement(name="name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement(name="country")
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@XmlElement(name="award")
	public String getAward() {
		return award;
	}

	public void setAward(String award) {
		this.award = award;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ClassCricketer [name=");
		builder.append(name);
		builder.append(", country=");
		builder.append(country);
		builder.append(", award=");
		builder.append(award);
		builder.append("]");
		return builder.toString();
	}

}
