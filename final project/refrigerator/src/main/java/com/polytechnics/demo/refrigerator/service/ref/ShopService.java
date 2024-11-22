package com.polytechnics.demo.refrigerator.service.ref;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.polytechnics.demo.refrigerator.model.ref.Cart;
import com.polytechnics.demo.refrigerator.repository.ShopRepository;

@Service
public class ShopService {

    @Autowired
    private ShopRepository shopRepository;

    public List<Cart> getAllItems() {
        return shopRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }
}
