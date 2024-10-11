package com.haji.demo.thymeleaf_test.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="lemp")
public class Lemp{
	
	@Id
	@Column(name="id")
    @Getter
    @Setter
	private String id;
	
	@Column(nullable=false)
    @Getter
    @Setter
	private String state;
    
	@Override
	public String toString() {
		return "id:" + id + ",state:" + state;
	}
}