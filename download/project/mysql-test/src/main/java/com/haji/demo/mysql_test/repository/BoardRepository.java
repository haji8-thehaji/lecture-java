package com.haji.demo.mysql_test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.haji.demo.mysql_test.model.Board;


public interface BoardRepository extends JpaRepository<Board, String> {
}

