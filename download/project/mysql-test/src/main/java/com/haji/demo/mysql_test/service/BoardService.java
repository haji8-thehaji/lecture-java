package com.haji.demo.mysql_test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haji.demo.mysql_test.model.Board;
import com.haji.demo.mysql_test.repository.BoardRepository;

@Service
public class BoardService{
    @Autowired
    private BoardRepository boardRepository;
    public List<Board> getAllBoardHajis() { 
        return boardRepository.findAll();
    } 
}