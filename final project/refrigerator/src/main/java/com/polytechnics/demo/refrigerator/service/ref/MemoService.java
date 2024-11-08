package com.polytechnics.demo.refrigerator.service.ref;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.polytechnics.demo.refrigerator.model.ref.Memo;
import com.polytechnics.demo.refrigerator.repository.MemoRepository;

@Service
public class MemoService{
    @Autowired
    private MemoRepository memoRepository;
    public List<Memo> getAllRecipes() { 
        return memoRepository.findAll();
    } 
}