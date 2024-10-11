package com.haji.demo.thymeleaf_test.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="lemp")
public class Lemp{
	
	@Id
	@Column(name="id")
	private String id;
	
	@Column(nullable=false)
	private String state;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
	@Override
	public String toString() {
		return "id:" + id + ",state:" + state;
	}
}