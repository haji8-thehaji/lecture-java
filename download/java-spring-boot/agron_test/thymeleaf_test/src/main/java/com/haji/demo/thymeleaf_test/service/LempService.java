package com.haji.demo.thymeleaf_test.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haji.demo.thymeleaf_test.model.Lemp;
import com.haji.demo.thymeleaf_test.repository.LempRepository;

@Service
public class LempService {
	@Autowired
	LempRepository lempRepository;
	
    // @Autowired
	// private final LempRepository lempRepository;
	
	public List<Lemp> getAllLemps() {
		return lempRepository.findAll();
	}
	
	public Lemp getLempById(String id) {
		Optional<Lemp> lemp = lempRepository.findById(id);
		return lemp.get();
	}
	
	public void saveLemp(Lemp lemp) {
		lempRepository.save(lemp);
	}
	
	public void updateLemp(Lemp lemp) {
		lempRepository.save(lemp);
	}
	
	public void deleteLemp(String id) {
		lempRepository.deleteById(id);
	}

}