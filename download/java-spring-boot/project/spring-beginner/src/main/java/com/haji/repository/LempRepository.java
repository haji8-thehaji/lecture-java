package com.haji.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.haji.demo.spring_beginner.model.Lemp2;

public interface LempRepository extends JpaRepository<Lemp2,String> {
    
}
