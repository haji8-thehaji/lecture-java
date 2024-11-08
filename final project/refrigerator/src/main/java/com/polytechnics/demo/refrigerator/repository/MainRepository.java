package com.polytechnics.demo.refrigerator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.polytechnics.demo.refrigerator.model.ref.User;

@Repository
public interface MainRepository extends JpaRepository<User, Long> {
    User findByUserName(String userName);
}
