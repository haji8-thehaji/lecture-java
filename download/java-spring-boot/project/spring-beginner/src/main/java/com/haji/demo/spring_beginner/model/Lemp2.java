package com.haji.demo.spring_beginner.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="lemp")
public class Lemp2 {
    @Id
    @Column(name="id")
	private String lempId;
    @Column(name="lemp_state")
	private String sec_state;



    public Lemp2(String lempId, String state) {
        this.lempId = lempId;
        this.sec_state = state;
    }
	public void on_button_pushed() {
	}
	public void off_button_pushed() {
	}

    public String getState() {
        return sec_state;
    }

    public void setState(String state) {
        this.sec_state = state;
    }

    public String getLempId() {
        return lempId;
    }

    public void setLempId(String lempId) {
        this.lempId = lempId;
    }
    public String getImage(){
        return "";
    }
    
}
