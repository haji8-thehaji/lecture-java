package com.haji.demo.thymeleaf_test.service.haji;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haji.demo.thymeleaf_test.model.haji.BoardHaji;
import com.haji.demo.thymeleaf_test.repository.haji.BoardHajiRepository;

@Service
public class BoardHajiService{
    @Autowired
    private BoardHajiRepository boardHajiRepository;
    public List<BoardHaji> getAllBoardHajis() { 
        return boardHajiRepository.findAll();
    } 
}