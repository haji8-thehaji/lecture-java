package com.haji.car_project.drive.state.type;

import com.haji.car_project.drive.DriveState;
import com.haji.car_project.drive.state.Gear;

public class DRIVE implements DriveState {

	private static DriveState instance = new DRIVE();
	
	public static DriveState getInstance() {
		return instance;
	}
	
	@Override
	public void up_push_button(Gear gear){
		System.out.println("change to - Reverse");
		gear.setState(REVERSE.getInstance());
    }
	@Override
	public void down_push_button(Gear gear){
		System.out.println("change to -");
    }
    public void printRun(){
		System.out.println("go go go");
	}
}
