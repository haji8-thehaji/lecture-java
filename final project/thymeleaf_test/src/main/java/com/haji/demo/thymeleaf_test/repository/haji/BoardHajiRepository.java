package com.haji.demo.thymeleaf_test.repository.haji;

import org.springframework.data.jpa.repository.JpaRepository;

import com.haji.demo.thymeleaf_test.model.haji.BoardHaji;


public interface BoardHajiRepository extends JpaRepository<BoardHaji, String> {

}