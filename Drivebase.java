package org.usfirst.frc.team3359.robot;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivebase extends Subsystem {
	
	private TalonSRX LeftMotor2;
	private TalonSRX LeftMotor4;
	private TalonSRX RightMotor1;
	private TalonSRX RightMotor3;
	
	public Drivebase() {
		LeftMotor2 = new TalonSRX(RobotMap.LEFT_MOTOR2.value);
		LeftMotor4 = new TalonSRX(RobotMap.LEFT_MOTOR4.value);
		RightMotor1 = new TalonSRX(RobotMap.RIGHT_MOTOR1.value);
		RightMotor3 = new TalonSRX(RobotMap.RIGHT_MOTOR3.value);
		
		Robot.initTalon(LeftMotor2);
		Robot.initTalon(LeftMotor4);
		Robot.initTalon(RightMotor1);
		Robot.initTalon(RightMotor3);
	}
	
	public void set(ControlMode mode, double leftvalue, double rightvalue) {
		LeftMotor2.set(mode, leftvalue);
		LeftMotor4.set(mode, leftvalue);
		RightMotor1.set(mode, rightvalue);
		RightMotor3.set(mode, rightvalue);
	}

	@Override
	protected void initDefaultCommand() {
		

	}

}
