package com.haji.demo.spring_beginner.common;

import com.haji.demo.spring_beginner.model.Lemp;

public class ON implements LightState {

	private static LightState instance = new ON();
	
	public static LightState getInstance() {
		return instance;
	}
	@Override
	public void on_button_pushed(Lemp light) {
		System.out.println("no action");
		light.setLempState(ON.getInstance());
	}
	@Override
	public void off_button_pushed(Lemp light) {
		System.out.println("Light Off!!");
		light.setLempState(OFF.getInstance());
	}
    @Override
    public String getString() {
        return "-ON-";
    }
	@Override
	public String getImage() {
		return "./lemp_on.png";
	}
}