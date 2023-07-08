package com.innova.expenseTracking.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.innova.expenseTracking.entities.RefreshToken;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {

	RefreshToken findByUserId(Long userId);

}
