package com.innova.expenseTracking.requests;

import lombok.Data;

@Data
public class RefreshRequest {

	Long userId;
	String refreshToken;
}