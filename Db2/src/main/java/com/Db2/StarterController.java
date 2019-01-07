package com.Db2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StarterController {
	ServiceClass service;
@RequestMapping("/hi")
void call()
{
	service.getAllBeanClasss();
}
}
