package com.springboot.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proje.db.DbConnection;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
@SpringBootApplication
public class SpringbootFirstAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootFirstAppApplication.class, args);
		//We can generate object use the methods
	/*	DbConnection dbConnection = new DbConnection();
		dbConnection.openConnection();
		dbConnection.closeConnection();
		

		BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");

		DbConnection dbConnection = (DbConnection) beanFactory.getBean("dbConnection");
		dbConnection.openConnection();
		dbConnection.closeConnection();
		
		AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		DbConnection dbConnection2 = abstractApplicationContext.getBean("dbConnection", DbConnection.class);		
		dbConnection2.openConnection();
		dbConnection2.closeConnection();*/
		
		ConfigurableApplicationContext configurableApplicationContext =  new ClassPathXmlApplicationContext("applicationContext.xml");
		
		DbConnection dbConnection4 = (DbConnection) configurableApplicationContext.getBean("dbConnection");
		
		dbConnection4.openConnection();
		dbConnection4.closeConnection();
		
		configurableApplicationContext.close();
		
	}

}
