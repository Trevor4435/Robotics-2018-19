//
//
//
////
//
//

package org.usfirst.frc.team3359.robot;

//import com.ctre.phoenix.motorcontrol.LimitSwitchNormal;
//import com.ctre.phoenix.motorcontrol.LimitSwitchSource;
//import com.ctre.phoenix.motorcontrol.NeutralMode;
//import com.ctre.phoenix.motorcontrol.can.*;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends TimedRobot {
	
	public static OI oi;
	public static Drivebase drivebase;
	
	@Override
	public void robotInit() {
		oi = new OI();
	}

	@Override
	public void disabledInit() {

	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void autonomousInit() {

	}

	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void teleopInit() {
	}

	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void testPeriodic() {
	}
	
	//public static void initTalon(TalonSRX motor){
		//motor.setNeutralMode(NeutralMode.Coast);
		//motor.neutralOutput();
		//motor.setSensorPhase(false);
		//motor.configForwardLimitSwitchSource(LimitSwitchSource.FeedbackConnector, LimitSwitchNormal.NormallyOpen, 0);
		//motor.configReverseLimitSwitchSource(LimitSwitchSource.FeedbackConnector, LimitSwitchNormal.NormallyOpen, 0);
		//motor.configNominalOutputForward(0.0, 0);
		//motor.configNominalOutputReverse(0.0, 0);
		//motor.configClosedloopRamp(0.5, 0);
		
	//}
}
