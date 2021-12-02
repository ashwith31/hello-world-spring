package com.bridgelabz;

import com.bridgelabz.component.EmployeeBean;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * Purpose: This class is called first whenever this app is run.
 *
 * @author Ashwith
 * @since 1/12/21
 */
@SpringBootApplication
@Slf4j
public class HelloWorldSpringApplication {

	public static final Logger logger = LoggerFactory.getLogger(HelloWorldSpringApplication.class);

	public static void main(String[] args) {
		logger.debug("Hello World!!");
		ApplicationContext context = SpringApplication.run(HelloWorldSpringApplication.class, args);
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		employeeBean.setEid(420);
		employeeBean.seteName("Spring Framework Guru");
		employeeBean.showEmployeeDetails();
	}
}
