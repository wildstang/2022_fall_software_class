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

driveStep(7);
turnStep(90);
driveStep(1);
intakeOnStep();
driveStep(2);
turnStep(90);
driveStep(4);
intakeOnStep();
turnStep(225);
 




