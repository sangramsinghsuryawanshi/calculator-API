package com.calculator.calculator_app_api.service;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.calculator.calculator_app_api.model.CalculatorAPI;
import com.google.gson.Gson;
@Component
public class CalculatorService 
{
	private static final Logger logger = LoggerFactory.getLogger(CalculatorService.class);
	private final Random random;
	private final Gson gson;

	public CalculatorService(Random random, Gson gson) {
		super();
		this.random = random;
		this.gson = gson;
	}

	public int isGetData(CalculatorAPI calapi)
	{
		String s=gson.toJson(calapi);
		logger.info("Service Layer logic: {}",calapi);
		int num=random.nextInt(100);
		int sum = calapi.getNum1()+calapi.getNum2();
		logger.info("Sum service: {}",sum);
		logger.info("Random service: {}",num);
		logger.info("gson google dependency convert obj to json: {}",s);
		return sum;
	}
}
