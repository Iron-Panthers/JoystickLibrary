package org.usfirst.frc.team5026.robot;
import edu.wpi.first.wpilibj.SpeedController;

public class MotorGroup implements SpeedController {

	private SpeedController[] motorGroup;
	private boolean[] isReversed;
	
	public MotorGroup(boolean[] isGroupInverted, SpeedController[] motors){
		isReversed = isGroupInverted;
		motorGroup = motors;
	}
	
	@Override
	public void pidWrite(double output) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double get() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void set(double speed, byte syncGroup) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void set(double speed) {
		// TODO Auto-generated method stub
		for(int i = 0; i < motorGroup.length; i++) {
			if(isReversed[i]) {
				motorGroup[i].set(-speed);
			}
			else if(!isReversed[i]) {
				motorGroup[i].set(speed);
			}
		}
		
	}

	@Override
	public void setInverted(boolean isInverted) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean getInverted() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void disable() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stopMotor() {
		// TODO Auto-generated method stub
		this.set(0);
		
	}

}
