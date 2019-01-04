package com.test.library;

import org.springframework.beans.factory.annotation.Value;

public class Variable {
	@Value("${welcome.hello}")
	String hi;
	public String send()
	{
	
	return hi;
	}
}
