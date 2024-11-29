package com.polytechnics.demo.refrigerator.service.ref;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.polytechnics.demo.refrigerator.model.ref.FoodInfo;
import com.polytechnics.demo.refrigerator.repository.ExpireRepository;

@Service
public class ExpireService {
    @Autowired
    private ExpireRepository expireRepository;

    public List<FoodInfo> getAllExpire() {
        return expireRepository.findAll();
    }

    public void deleteExpire(int id) {
        expireRepository.deleteById(id);
    }
}
