package com.ou_solutions.currencyconversionservices.entity;

import java.math.BigDecimal;

public class MoneyConversion {
	
	private Long id;
	private String fromCurrency;
	private String toCurrency;
	private Double rate;
	private Integer inputCurrency;
	private Double outputFinalValue;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public Integer getInputCurrency() {
		return inputCurrency;
	}
	public void setInputCurrency(Integer inputCurrency) {
		this.inputCurrency = inputCurrency;
	}
	public Double getOutputFinalValue() {
		return outputFinalValue;
	}
	public void setOutputFinalValue(Double outputFinalValue) {
		this.outputFinalValue = outputFinalValue;
	}
	
	
	

}
