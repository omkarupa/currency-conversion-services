package com.ou_solutions.currencyconversionservices.services;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.ou_solutions.currencyconversionservices.entity.CurrencyRates;
import com.ou_solutions.currencyconversionservices.entity.MoneyConversion;

@Service
public class ConversionServices {
	
	Log log = LogFactory.getLog(getClass());
	
	List<CurrencyRates> currencyRates = new ArrayList<>();
	
	public ConversionServices() {
		
		log.info("Currency Service object Inilialised");
		
		CurrencyRates currencyRates1 = new CurrencyRates("MYR", "INR", 17.98);
		CurrencyRates currencyRates2 = new CurrencyRates("MYR", "DOLLARS", 0.22);
		
		CurrencyRates currencyRates3 = new CurrencyRates("MYR", "DONG", 5133.81);
		
		CurrencyRates currencyRates4 = new CurrencyRates("DOLLARS", "INR", 82.55);
		CurrencyRates currencyRates5 = new CurrencyRates("EURO", "INR", 88.48);
		
		currencyRates.add(currencyRates1);
		currencyRates.add(currencyRates2);
		currencyRates.add(currencyRates3);
		currencyRates.add(currencyRates4);
		currencyRates.add(currencyRates5);
		
		
		log.info("Current Currency rates exchange size : " + currencyRates.size());
	
		
	}

	public List<CurrencyRates> getCurrencyRates() {
		return currencyRates;
	}

	public void setCurrencyRates(List<CurrencyRates> currencyRates) {
		this.currencyRates = currencyRates;
	}
	
	public MoneyConversion convertMoney(String from,String to)
	{
		CurrencyRates currencyFound = null;
		MoneyConversion money = null;
		
		if(currencyRates.size() > 0)
		{
			for(CurrencyRates currencyRate : currencyRates)
			{
				if(currencyRate.getFromCurrency().equals(from) && currencyRate.getToCurrency().equals(to))
				{
					currencyFound = currencyRate;
				}
			}
		}
		
		
		if(currencyFound != null)
		{
			money = new MoneyConversion();
			money.setFromCurrency(from);
			money.setToCurrency(to);
			money.setRate(currencyFound.getRate());
			
			
		}
		
		return money;
	}

	private List<CurrencyRates> mapToCurrency(CurrencyRates currency, String from, String to) 
	{
		List<CurrencyRates> currencyRates = null;
		if(currency.getFromCurrency().equals(from) && currency.getToCurrency().equals(to))
				{
					currencyRates.add(currency);
				}
		return null;
	}

}
