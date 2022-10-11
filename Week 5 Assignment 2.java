// WildStang Fall Software Week 5 Assignment 2

// As always, edit this file while in your branch of this folder (repository)

///////////////////////////////////////
// We're going to turn the pseudo-coded subsystem from last week into an actual subsystem

// The subsystem you will code has the following controls and motors
// a motor runs intake wheels
// a motor runs some feed wheels
// a motor runs some launcher wheels
// a pneumatic deploys/retracts the intake
// holding the a button deploys the intake and runs the intake wheels at 100%
// holding the right trigger runs the feed wheels at 100%
// holding the left trigger runs the launcher wheels at the launcher speed
// left bumper sets the launcher speed to 50%
// right bumper sets the launcher speed to 100%
// left and right bumper at the same time sets the launcher speed to 75%

// WsOutputs has the following motors/pneumatics declared
// INTAKE_MOTOR, FEED_MOTOR, LAUNCHER_MOTOR, INTAKE_SOLENOID

// Write the code for init(), update(), and inputUpdate() to run this subsystem

public void init() {
	
	intakeMotor = (WsSparkMax) Core.getOutputManager().getOutput(WSOutputs.INTAKE_MOTOR);
	feedMotor = (WsSparkMax) Core.getOutputManager().getOutput(WSOutputs.FEED_MOTOR);
	launcherMotor = (WsSparkMax) Core.getOutputManager().getOutput(WSOutputs.LAUNCHER_MOTOR);
	
	intakeSolenoid = (WsSolenoid) Core.getOutputManager().getOutput(WSOutputs.INTAKE_SOLENOID);
	
	aButton = (WsJoystickButton) Core.getInputManager().getInput(WsInputs.DRIVER_FACE_DOWN);
	aButton.addInputListener(this);
	rightTrigger = (WsJoystickButton) Core.getInputManager().getInput(WsInputs.DRIVER_RIGHT_TRIGGER);
	rightTrigger.addInputListener(this);
	leftTrigger = (WsJoystickButton) Core.getInputManager().getInput(WsInputs.DRIVER_LEFT_TRIGGER);
	leftTrigger.addInputListener(this);
	leftBumper = (WsJoystickButton) Core.getInputManager().getInput(WsInputs.DRIVER_LEFT_SHOULDER);
	leftBumper.addInputListener(this);
	rightBumper = (WsJoystickButton) Core.getInputManager().getInput(WsInputs.DRIVER_RIGHT_SHOULDER);
	rightBumper.addInputListener(this);

			
}

public void inputUpdate(Input Source) {

	if intakeSolenoid.WsSolenoidState.FORWARD {
	
		intakeMotor.setSpeed(1.0);
	
	}
	else if intakeSolenoid.WsSolenoidState.REVERSE {
	
		intakeMotor.setSpeed(-1.0);
	
	}
	
	stateButton = aButton.getValue();
	
	if stateButton == true {
	
		intakeMotor.setSpeed(1.0);
		
	}
	
	stateRightTrigger = rightTrigger.getValue();
		
	if stateRightTrigger == true {
	
		feedMotor.setSpeed(1.0);
	
	}
	
	stateLeftTrigger = leftTrigger.getValue();
	double launcherSpeed;
	
	if stateLeftTrigger == true {
	
		launcherMotor.setSpeed(launcherSpeed);
	
	}
	
	stateLeftBumper = leftBumper.getValue();
		
	if (source == leftBumper && leftBumper.getValue()) stateLeftBumper = !stateLeftBumper;
	
	if stateLeftBumper == true {
	
		launcherSpeed = 0.5;
	}
	
	stateRightBumper = rightBumper.getValue();
	
	if (source == rightBumper && rightBumper.getValue()) stateRightBumper = !stateRightBumper;
	
	if stateRightBumper == true {
	
		launcherSpeed = 1.0;
	
	}
	
	if stateLeftBumper == true && stateRightBumper == true {
		
		launcherSpeed = 0.75;
	}
	
	
	
	
}

public void update() {
	//your code goes below
	
	
	
	
	
	
}
