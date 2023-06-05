package com.ou_solutions.currencyconversionservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ou_solutions.currencyconversionservices.entity.MoneyConversion;
import com.ou_solutions.currencyconversionservices.services.ConversionServices;

@RestController
@RequestMapping("/api/money-conversion")
public class ConversionController {
	
	@Autowired
	ConversionServices conversionService;
	
	
	@GetMapping("from/{fromCurrency}/to/{toCurrency}")
	public MoneyConversion fromCurrencyToCurrency(@PathVariable String fromCurrency,@PathVariable String toCurrency)
	{
		return conversionService.convertMoney(fromCurrency, toCurrency);
	}

}
