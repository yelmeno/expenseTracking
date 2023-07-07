package com.innova.expenseTracking.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.innova.expenseTracking.entities.User;
import com.innova.expenseTracking.repos.UserRepository;

@Service
public class UserService {
	
	private UserRepository userRepository;
	
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	public User saveOneUser(User newUser) {
		return userRepository.save(newUser);
	}

	public User getOneUserById(Long userId) {
		return userRepository.findById(userId).orElse(null);
	}

	public User updateOneUser(Long userId, User newUser) {
		Optional<User> user = userRepository.findById(userId);
		if(user.isPresent()) {
			User foundUser = user.get();
			foundUser.setFirstname(newUser.getFirstname());
			foundUser.setLastname(newUser.getLastname());
			foundUser.setPassword(newUser.getPassword());
			foundUser.setEmail(newUser.getEmail());
			
			userRepository.save(foundUser);
			return foundUser;
		}else
			return null;
	}

	public void deleteById(Long userId) {
		userRepository.deleteById(userId);
		
	}
	
}
