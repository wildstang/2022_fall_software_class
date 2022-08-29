//WildStang Fall Software Week 3 Assignment 1

//As always, edit this file while in your branch of this folder (repository)

///////////////////////////////////////
//Battleship! We're going to create two classes to help a game of battleship run. These will be the player class, 
//which controls one side of the board for one player, and the ship class, which controls each individual ship on a board.

//Each player should track their 8x8 field (in a Boolean[8][8]). This field should note whether a space is occupied by 
//a ship (true) or empty (false). Your class should also have an array of your ships.

//Each player should have a method where a coordinate is input, and a boolean is returned whether the shot is a hit or 
//not. It should also have a method to indicate whether that hit sunk a ship, and to determine if all ships are sunk - and the game is over.

//The ship class should contain the coordinates of it's different locations, as well as the status of each position 
//(true for hit, false for safe). It should have a method to determine if it is sunk (all positions hit), and a method taking in 
//a location, turning that location to hit if it was safe, and responding whether it was a hit or a miss. 

//The class that would control the game will look something like this. A player should be created with an array of ships as the 
//argument, while a Ship should be created as an array of coordinates

boolean gameOver = false;

while (!gameOver){
	//swap player roles
	//get firing location from a player
	if (Player.firedAt(location X, location Y)){
		System.out.println("Hit!");
		if (Player.didSink(location X, location Y)){
			System.out.println("Ship is sunk!");
			if (Player.isGameOver()){
				gameOver = true;
				System.out.println("Game is over!");
			}
		}
	} else System.out.println("Miss!");
}

//Your methods go below
//Player class









//Ship class










