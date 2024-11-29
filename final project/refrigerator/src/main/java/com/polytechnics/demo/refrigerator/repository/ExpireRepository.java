package com.polytechnics.demo.refrigerator.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.polytechnics.demo.refrigerator.model.ref.FoodInfo;

public interface ExpireRepository extends JpaRepository<FoodInfo, Integer> {

}