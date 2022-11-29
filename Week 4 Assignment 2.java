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
	
	run auto
	After 15 seconds run 
	{//Tele op init Function}
		switch code to control based
	
	
	
	
}

public void inputUpdate(Input Source) {
	//your code goes below
	
	{Set controls: 
	A = retract/put out intake
		Right/left trigger sets launch speed 50/100
	
		If Button L is pressed...
		If button R is pressd...
		If button A is pressed
		If button X is pressed...
		
		//etc.
		
	}
		
	
	
	
	
}

public void update() {
	//your code goes below
	
	
	Run Intake if y is pressed.
		Run Launcher if X is presed
	
	
	
}
