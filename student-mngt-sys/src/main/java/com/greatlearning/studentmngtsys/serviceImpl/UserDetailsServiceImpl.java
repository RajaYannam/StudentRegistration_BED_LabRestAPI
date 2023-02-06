package com.greatlearning.studentmngtsys.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.greatlearning.studentmngtsys.repository.UserRepository;
import com.greatlearning.studentmngtsys.security.config.SecurityDetails;

public class UserDetailsServiceImpl implements UserDetailsService {
    
	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	  return new SecurityDetails(userRepository.getUserByUsername(username));

	}

}
