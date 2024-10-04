package com.haji.demo.thymeleaf_test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.haji.demo.thymeleaf_test.model.Book2;

public interface BookRepository extends JpaRepository<Book2,String> {

}