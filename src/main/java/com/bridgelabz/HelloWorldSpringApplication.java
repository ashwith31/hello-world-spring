package com.bridgelabz;

import com.bridgelabz.component.EmployeeBean;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class HelloWorldSpringApplication {

	public static final Logger logger = LoggerFactory.getLogger(HelloWorldSpringApplication.class);


	public static void main(String[] args) {
		logger.debug("Hello World!!");
		ApplicationContext context = SpringApplication.run(HelloWorldSpringApplication.class, args);
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		employeeBean.setEid(104);
		employeeBean.setEname("Spring Framework Guru");
		employeeBean.showEmployeeDetails();
	}
}
