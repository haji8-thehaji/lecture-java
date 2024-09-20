package com.haji.car_project.drive;

import com.haji.car_project.drive.state.Gear;

public interface DriveState {
	public void up_push_button(Gear gear);
	public void down_push_button(Gear gear);

    public void print_run();
}
