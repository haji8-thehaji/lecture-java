package com.haji.car_project.drive.state.type;

import com.haji.car_project.drive.DriveState;
import com.haji.car_project.drive.state.Gear;

public class REVERSE implements DriveState {

	private static DriveState instance = new REVERSE();
	
	public static DriveState getInstance() {
		return instance;
	}
	@Override
	public void up_push_button(Gear gear){
		System.out.println("change to - Parking");
		gear.setState(PARKING.getInstance());
    }
	@Override
	public void down_push_button(Gear gear){
		System.out.println("change to - DRIVE");
		gear.setState(DRIVE.getInstance());
    }
	@Override
    public void print_run(){
		System.out.println("go back");
	}
}
