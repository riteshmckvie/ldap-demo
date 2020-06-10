package com.ritesh.practise;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ritesh.practise.repository.PersonRepository;

@RestController
public class HomeResource {
	
	@Autowired
	private PersonRepository PersonRepository;

	@GetMapping("/")
	public String defaultPage() {

		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String currentPrincipalName = authentication.getName();
		return "Hi " + currentPrincipalName + " !! You have successfully authenticated using ldap";
	}
	
	@GetMapping("/users")
	public List<String> getAllPersonNames() {
		return PersonRepository.getAllPersonNames();
		
	}

}
