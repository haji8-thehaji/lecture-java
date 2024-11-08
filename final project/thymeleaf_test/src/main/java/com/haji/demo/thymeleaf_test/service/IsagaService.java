package com.haji.demo.thymeleaf_test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haji.demo.thymeleaf_test.model.Isagaroot.Isaga;
import com.haji.demo.thymeleaf_test.repository.IsagaRepository;

@Service
public class IsagaService
{

	@Autowired
	IsagaRepository isagaRepository;

	/**
	* 글 목록을 조회한다.
	* @param searchVO - 조회할 정보가 담긴 VO
	* @return 글 목록
	*/
	public List<Isaga> getAllIsagas() {
		return isagaRepository.findAll();
	}
}
