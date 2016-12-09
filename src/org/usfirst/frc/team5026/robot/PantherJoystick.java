package org.usfirst.frc.team5026.robot;

import edu.wpi.first.wpilibj.Joystick;

public class PantherJoystick extends Joystick{
	
	int joystickThrottleValue;
	
	public PantherJoystick(int port) {
		super(port);
	}
	
	
	public double getScaledDeadzoneX() {
		

		double newX = 0;

		newX = this.getScaledDeadzoneMagnitude(Constants.DEADZONE) * Math.cos(this.getDirectionDegrees());
		return newX;
	}
	
	public double getScaledDeadzoneY() {
		
		double newY = 0;
		
		newY = this.getScaledDeadzoneMagnitude(Constants.DEADZONE) * Math.sin(this.getDirectionDegrees());
		return newY;
	}
	
	public double getScaledDeadzoneMagnitude(float deadzone) {
		double xVal = this.getX();
		double yVal = this.getY();
		double magnitude = Math.sqrt(xVal * xVal + yVal * yVal);
		
		if(magnitude < deadzone) {
			xVal = 0;
			yVal = 0;
		}
		else {
			magnitude = (magnitude - deadzone) / (1 - deadzone);
		}
		return magnitude;
	}
	/*
	public throttleMode() {
		joystickThrottlevalue = this.getThrottle();
	}
	*/

}
