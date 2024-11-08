package com.polytechnics.demo.refrigerator.service.ref;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.polytechnics.demo.refrigerator.model.ref.User;
import com.polytechnics.demo.refrigerator.repository.MainRepository;

@Service
public class MainService {
    
    @Autowired
    private MainRepository mainRepository;

    public User getUserByName(String userName) {
        return mainRepository.findByUserName(userName);
    }
}
