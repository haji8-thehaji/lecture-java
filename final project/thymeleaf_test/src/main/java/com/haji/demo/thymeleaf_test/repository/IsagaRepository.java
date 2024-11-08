package com.haji.demo.thymeleaf_test.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.haji.demo.thymeleaf_test.model.Isagaroot.Isaga;

public interface IsagaRepository extends JpaRepository<Isaga,String> 
{

}