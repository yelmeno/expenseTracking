package com.innova.expenseTracking.scheduledBackgroundJob;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyScheduledTask {
	
	@Scheduled(fixedRate = 6000)
	public void performTask() {
		
		System.out.println("Deneme running...");
	}
}
