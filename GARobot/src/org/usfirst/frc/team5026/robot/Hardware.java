package org.usfirst.frc.team5026.robot;

import edu.wpi.first.wpilibj.Talon;

public class Hardware {
	public MotorGroup leftDrive;
	public MotorGroup rightDrive;

//wayne is cool
	public Hardware() {
		Talon[] leftMotors = {new Talon(Constants.DRIVE_LEFT_MOTOR_1), new Talon(Constants.DRIVE_LEFT_MOTOR_2), new Talon(Constants.DRIVE_LEFT_MOTOR_3)};
		Talon[] rightMotors = {new Talon(Constants.DRIVE_RIGHT_MOTOR_1), new Talon(Constants.DRIVE_RIGHT_MOTOR_2), new Talon(Constants.DRIVE_RIGHT_MOTOR_3)};
		boolean[] leftInverted = {false, true, false};
		boolean[] rightInverted = {false, true, false};
		
		leftDrive = new MotorGroup(leftInverted, leftMotors);
		rightDrive = new MotorGroup(rightInverted, rightMotors);
	}
}
