package com.polytechnics.demo.refrigerator.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.polytechnics.demo.refrigerator.model.ref.Memo;


public interface MemoRepository extends JpaRepository<Memo, Integer> {

}