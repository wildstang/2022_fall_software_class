// WildStang Fall Software Week 5 Assignment 1

// As always, edit this file while in your branch of this folder (repository)

///////////////////////////////////////
// Modeling all of the different basic buttons

///////////////////////////////////////
// Activity 1
// create the code for a "hold" button - a button that only does something when the button is held down
// In this case, boolean isButtonOn should be true if the button is held and false when it isn't

boolean isButtonOn = false;
WsJoystickButton button = (WsJoystickButton) Core().getInputManager().getInput(WsInputs.DRIVER_FACE_DOWN);

public void inputUpdate(Input source) {
	// your code goes here
	
	
	if button.getValue() == true {
	
		isButtonOn = true
		
	}
	else {
	
	isButtonOn = false
		
	}
	
	
	
}

///////////////////////////////////////
// Activity 2
// Create the code for a "toggle" button - a button that changes states based on each time it's pressed
// boolean isButtonOn will start as false, change to true once the button is pressed, then change back to false
// if pressed again, then true, etc...

boolean isButtonOn = false;
WsJoystickButton button = (WsJoystickButton) Core().getInputManager().getInput(WsInputs.DRIVER_FACE_DOWN);

public void inputUpdate(Input Source) {
	// your code goes here
	
	if button.getValue() == true {
	
		if isButtonOn == false {
		
			isButtonOn = true
			
		}
	
	}
	else {
	
		isButtonOn = false
	
	}
	
	
	
	
}

///////////////////////////////////////////
// Activity 3
// Create code for a modifier by combining the previous 2. In this case, hold button button1 sets boolean1 to true,
// but sets boolean2 to true instead if button2 is held. button3 sets boolean3 to true, but boolean4 to true if button2 is held.
// In short
// button1: boolean1
// button3: boolean3
// button1 and button2: boolean2
// button3 and button2: boolean4

boolean boolean1 = false;
boolean boolean2 = false;
boolean boolean3 = false;
boolean boolean4 = false;
DigitalInput button1 =  (WsJoystickButton) Core().getInputManager().getInput(WsInputs.DRIVER_FACE_UP);
DigitalInput button2 =  (WsJoystickButton) Core().getInputManager().getInput(WsInputs.DRIVER_FACE_RIGHT);
DigitalInput button3 =  (WsJoystickButton) Core().getInputManager().getInput(WsInputs.DRIVER_FACE_DOWN);

public void inputUpdate(Input source) {
	// your code goes here
	
	state1 = button1.getValue();
	state2 = button2.getValue();
	state3 = button3.getValue();
	
	if state1 == true {
	
		boolean1 = true
	}
	
	if state3 == true {
	
		boolean3 = true
	}
	
	if state1 == true && state2 == true {
	
		boolean2 = true
	}
	
	if state3 == true && state2 == true {
	
		boolean4 = true
	}
	
	
	
	
}

///////////////////////////////////////////
// Activity 4
// create code to handle deadband in a joystick. Deadband means that when the joystick value is below
// a certain number, it reads out 0 instead (to prevent drift if the joystick doesn't rest at exactly 0).
// For the rest of the numbers, the outputs are scaled so that the results still go from 0 to 100 linearly.
// E.G. If the deadband is 10%, then up to 10% should be 0, while now the rest of the values should be 
// deadbandValue = (value - deadband) * max_value / (max_value - deadband)

double deadband = 0.1;
WsJoystickAxis joystick = (WsJoystickAxis) Core().getInputManager().getInput(WsInputs.DRIVER_LEFT_JOYSTICK_Y);

public void inputUpdate(Input Source) {
	// your code goes here
	
	
	
	
	
}
