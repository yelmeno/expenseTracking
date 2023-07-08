package com.innova.expenseTracking;

import org.apache.logging.log4j.Logger;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
//@EnableScheduling
public class ExpenseTrackingApplication {
		
	

	public static void main(String[] args) {
		SpringApplication.run(ExpenseTrackingApplication.class, args);
	}
	

}
