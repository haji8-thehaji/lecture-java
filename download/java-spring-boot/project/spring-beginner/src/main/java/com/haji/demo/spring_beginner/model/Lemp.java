package com.haji.demo.spring_beginner.model;

import com.haji.demo.spring_beginner.common.LightState;
import com.haji.demo.spring_beginner.common.OFF;

public class Lemp {
	private String lempId;
	private String sec_state;


    

	private LightState lempState = OFF.getInstance();

    public Lemp(String lempId, String state, LightState lempState) {
        this.lempId = lempId;
        this.sec_state = state;
        this.lempState = lempState;
    }
	public void on_button_pushed() {
		lempState.on_button_pushed(this);
	}
	public void off_button_pushed() {
		lempState.off_button_pushed(this);
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
    public String  getLempState() {
        return lempState.getString();
    }

    public void setLempState(LightState lempState) {
        this.lempState = lempState;
    }

    public String getImage(){
        return lempState.getImage();
    }
    
}
