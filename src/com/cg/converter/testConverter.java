package com.cg.converter;

public class testConverter {
	public static void main(String[] args) {
		Currency USD = new Currency("USD", 71.53);
		Currency INR = new Currency("INR", 1);
		Currency EUR = new Currency("EUR", 79.43);
	
		Converter ccc = new CurrencyConverter();
		ccc.convert(USD, INR, 1.0);
		ccc.convert(INR, USD, 1.0);
		ccc.convert(INR, EUR, 1.0);
	}

	
	
	
	
}
