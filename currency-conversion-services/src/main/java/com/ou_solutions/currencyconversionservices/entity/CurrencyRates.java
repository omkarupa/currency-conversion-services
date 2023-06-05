package com.ou_solutions.currencyconversionservices.entity;

import java.math.BigDecimal;

public class CurrencyRates {
	
	private String fromCurrency;
	private String toCurrency;
	private Double rate;
	
	
	
	public CurrencyRates(String fromCurrency, String toCurrency, Double rate) {
		super();
		this.fromCurrency = fromCurrency;
		this.toCurrency = toCurrency;
		this.rate = rate;
	}
	public CurrencyRates() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getFromCurrency() {
		return fromCurrency;
	}
	public void setFromCurrency(String fromCurrency) {
		this.fromCurrency = fromCurrency;
	}
	public String getToCurrency() {
		return toCurrency;
	}
	public void setToCurrency(String toCurrency) {
		this.toCurrency = toCurrency;
	}
	public Double getRate() {
		return rate;
	}
	public void setRate(Double rate) {
		this.rate = rate;
	}
	
	
	

}
