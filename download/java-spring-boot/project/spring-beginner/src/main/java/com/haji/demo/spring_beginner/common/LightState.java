package com.haji.demo.spring_beginner.common;

import com.haji.demo.spring_beginner.model.Lemp;

public interface LightState {
	public void on_button_pushed(Lemp light);
	public void off_button_pushed(Lemp light);
    public String getString();
    public String getImage();
}
