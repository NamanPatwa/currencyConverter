package com.cg.converter;

public class Currency {
 private final String name;
 private final double rate;
 
public String getName() {
	return name;
}

public double getRate() {
	return rate;
}

public Currency(String name, double rate) {
	super();
	this.name = name;
	this.rate = rate;
}
  
}
