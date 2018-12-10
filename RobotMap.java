/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team3359.robot;

public enum RobotMap {
// facing the back of robot
LEFT_MOTOR2(0),
LEFT_MOTOR4(1),
RIGHT_MOTOR1(2),
RIGHT_MOTOR3(3),
//
LEFT_JOYSTICK(0),
RIGHT_JOYSTICK(1);


	public final int value;
	
	RobotMap(int value){
		this.value = value;
	}
}
