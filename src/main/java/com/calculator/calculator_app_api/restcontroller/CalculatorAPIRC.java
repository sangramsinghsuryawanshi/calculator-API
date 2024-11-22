package com.calculator.calculator_app_api.restcontroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.calculator.calculator_app_api.model.CalculatorAPI;
import com.calculator.calculator_app_api.service.CalculatorService;

@RestController
public class CalculatorAPIRC 
{
	private  CalculatorService calser;
	private ApplicationContext apcon;
	
	public CalculatorAPIRC(CalculatorService calser,ApplicationContext apcon) {
		super();
		this.calser = calser;
		this.apcon=apcon;
		logger.info("Instence created..{}",calser);
	}
	private static final Logger logger = LoggerFactory.getLogger(CalculatorAPIRC.class);
	 @PostMapping("/add")
	 public int getBodyObj(@RequestBody CalculatorAPI calapi) 
	 {
		 calser = apcon.getBean(CalculatorService.class);
		 String[]s=apcon.getBeanDefinitionNames();
		 for(String s1:s)
		 {
			 logger.info("Spring bean present in spring container: {}",s1);
		 }
	      logger.info("Received values: {}", calapi);
	      int sum =  calser.isGetData(calapi);
			logger.info("Sum entry: {}",sum);
	      return sum;
	 }
}
