package com.haji.demo.thymeleaf_test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.haji.demo.thymeleaf_test.model.Lemp;

public interface LempRepository extends JpaRepository<Lemp,String> {

}