package com.abgi.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExchangeValue {

	private Long id;
	private String from;
	private String to;
	private BigDecimal conversionMultiple;
	private int port;

	public ExchangeValue() {
	}

	public ExchangeValue(Long id, String from, String to, BigDecimal conversionMultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
	}

}
