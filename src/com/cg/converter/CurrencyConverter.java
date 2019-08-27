package com.cg.converter;

public class CurrencyConverter implements Converter{
		
	@Override
	public void convert(Currency c1, Currency c2, Double amount) {
		System.out.println((c1.getRate()/c2.getRate())*amount);	
	}
}
