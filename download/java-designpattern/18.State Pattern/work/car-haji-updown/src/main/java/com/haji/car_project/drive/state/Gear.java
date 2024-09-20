package com.haji.car_project.drive.state;

import com.haji.car_project.drive.DriveState;
import com.haji.car_project.drive.state.type.DRIVE;

public class Gear {
    
	private DriveState state = DRIVE.getInstance();

    public Gear() {
    }
	public void setState(DriveState state) {
		this.state = state;
	}
	public void up_push_button() {
		state.up_push_button(this);
	}
	public void down_push_button() {
		state.down_push_button(this);
	}
	public void accel(){
		state.print_run();
	}
}
