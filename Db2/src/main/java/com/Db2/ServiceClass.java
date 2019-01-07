package com.Db2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceClass implements ServiceInter {
	@Autowired
	BeanClassDao BeanClassDao;
	@Override
	public void getAllBeanClasss() {
		 BeanClassDao.getAllBeanClasss();
		
		}
	}
