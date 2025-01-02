package com.innot.priceapi.price_service;

import org.springframework.boot.SpringApplication;

public class TestPriceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(PriceServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
