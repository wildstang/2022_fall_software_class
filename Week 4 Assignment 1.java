// WildStang Fall Software Week 4 Assignment 1

// As always, edit this file while in your branch of this folder (repository)

///////////////////////////////////////
// Create your own autonomous program using the following steps

intakeOnStep();
shootStep(distance); // distance is the distance it will score from
stopShootingStep();
driveStep(distance); // distance that the robot drives in a straight line
turnStep(degrees); // the number of degrees the robot turns
delayStep(); // does nothing for some seconds

// Your robot is starting at (0,0), and can hold a maximum of two cargo. There are cargo
// at (1,7), (3,3), (7,6), and (9,1). There is a goal at (10,10) to score the cargo in. We want
// to score all 4 cargo, using the 5 steps from above

///**/
//turn,drive root 14 feet,intake,turn to 1,7,drive root 17, turn towards goal, shoot root 90, turn to 7,4, drive root 45, intake,
//turn 9,1, drive root 14, intake, turn to face goal, shoot root 82. 

turnStep(toward(2,3));
driveStep(3.7);
intakeOnStep();
turnStep(toward(1,7));
driveStep(4.1);
intakeOnStep();
turnStep(toward goal);
shootStep(root 90);
turnStep(toward(7,4));
driveStep(root 45);
intakeOnStep();
turnStep(9,2);
driveStep(root 14);
intakeOnStep();
turnStep(toward goal);
shootStep(root 82);
