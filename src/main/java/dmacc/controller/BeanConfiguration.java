package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Phone;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Phone phone() {
		Phone bean = new Phone("Apple");
		//bean.setBrand("Apple");
		//bean.setModel("Iphone XR");
		//bean.setCarrier("US Cellular");
		return bean;
	}
}
