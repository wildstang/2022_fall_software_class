// WildStang Fall Software Week 4 Assignment 2

// As always, edit this file while in your branch of this folder (repository)

///////////////////////////////////////
// We're going to pseudo-code a subsystem. This means, write down in english what each line of code does instead of actually programming it
// i.e. to create an array, just write "create array myArray" and describe what's in it

// The subsystem you will pseudo-code has the following controls and motors
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

// Write the pseudo-code for init(), update(), and inputUpdate() to run this subsystem

public void init() {
	//your code goes below
	
A moter spins the intake feed once
a moter runs a couple feed wheels once
a moter runs a few launcher wheels
a pneumatic deploys once then it retracts
the "a" button deploys the intake one time and then runs the intake wheels at 100%
the right trigger runs the feed wheels at 100% while the button is pressed
the launcher wheels runs at the luancher speed once
the left bumper sets the luancher speed to 50%
the right bumper sets the launcher speed to 100%
pressing both the left and right buttons at the same timesets the launcher to 75%
}

public void inputUpdate(Input Source) {
	//your code goes below(
while button 1 is pressed a moter runs the intake wheels
while button 2 is pressed a moter runs a couple feed wheels
while button 3 is pressed a moter turns the launcher wheels
while button 4 is pressed a pneumatic deploys: and retracts when button is released
while button "a" is held the intake is deployed and the intake wheels are run at 100%
when the "right trigger" is pressed the feed wheels are run at 100% 
holding the "left trigger" runs the wheels at the current launcher speed
pressing the "left bumper" runs  the launcher speed to 50%
pressing the "right bumper" sets the launcher speed to 100%
when both the "left" and "right" buttons are pressed together it sets the laincher speed to 75%
}

public void update() {
	//your code goes below
a moter continually runs intake wheels
a moter constantly runs a few feed wheels
a moter keeps on running a few launcher wheels
a  pnematic continually  deploys then retracts
holding the a button deploys the intake and runs theintake wheels at 100%
holding the right trigger runs the feed wheels at 100%
holding the left trigger runs the launcher wheels at the launcher speed
the left button sets the launcher speed to50%
}
