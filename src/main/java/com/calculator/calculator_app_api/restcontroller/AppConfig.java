package com.calculator.calculator_app_api.restcontroller;

import java.util.Random;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig 
{
	@Bean
	Random getRandom()
	{
		return new Random();
	}
}
