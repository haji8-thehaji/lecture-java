package com.haji.demo.spring_beginner.model;

import com.haji.demo.spring_beginner.common.LightState;
import com.haji.demo.spring_beginner.common.OFF;
import com.haji.demo.spring_beginner.common.ON;

public class Lemp {
    
	private String lempId;
	private String state;
	private LightState lempState = OFF.getInstance();

    public Lemp(String lempId, String state, LightState lempState) {
        this.lempId = lempId;
        this.state = state;
        this.lempState = lempState;
    }
	public void on_button_pushed() {
		lempState.on_button_pushed(this);
	}
	public void off_button_pushed() {
		lempState.off_button_pushed(this);
	}

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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
        if (lempState == ON.getInstance()){
            return "./lemp_on.png";
        }
        else{
            return "./lemp_off.png";
        }
    }
    
}
