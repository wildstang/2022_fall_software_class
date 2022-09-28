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

Rover robot = new Rover();
Rover.moveto(1, 7);
Rover.moveto(7, 6);


class Rover {
  private xlocation = 0;
  private ylocation = 0
  private heading = 0
  void moveto(int x, int y) {
    // Turning
    
    int xside = Math.abs(xlocation - x);
    int yside = Math.abs(ylocation - y);
    
    double angle = Math.atan((double) yside / xside);
      
    int destheading;
    
    // First quadrant
    if (x > xlocation && y > ylocation) {
      destheading = 0 + angle;
    }
    
    // Second quadrant
    else if (x > xlocation && y < ylocation) {
      destheading = 180 - angle;
    }
    
    // Third quadrant
    else if (x < xlocation && y < ylocation) {
      destheading - 180 + angle;
    }
    
    // Fourth quadrant
    else if (x < xlocation && y > ylocation) {
      destheading = 360 - angle; 
    }
    
    turnstep(destheading - heading);
    
    // Move
    driveStep(Math.sqrt(Math.pow(xside, 2) + Math.pow(yside, 2)));
  }
}



