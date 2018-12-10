//
//
//
//
//
//

package org.usfirst.frc.team3359.robot;

import edu.wpi.first.wpilibj.Joystick;

public class OI {
	public static double JOY_DEADZONE = 0.05;
	
	public final Joystick LEFT_JOY = new Joystick(RobotMap.LEFT_JOYSTICK.value);
	public final Joystick RIGHT_JOY = new Joystick(RobotMap.RIGHT_JOYSTICK.value);
	
	public double getLeftJoyX() {
	double raw = LEFT_JOY.getX();
		return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
	}
	
	public double getLeftJoyY() {
		double raw = LEFT_JOY.getY();
		return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
	}
	
	public double getRightJoyX() {
		double raw = RIGHT_JOY.getX();
		return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
	}
	
	public double getRightJoyY() {
		double raw = RIGHT_JOY.getY();
		return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
	}
	
	public OI(){
		
	}
}
