/*
An adventurer has:
•	A location (some room).
•	An inventory (the things being carried).  When the player executes the “take thing” command, the item should be added to the inventory.

An adventurer can:
•	Move from room to room.
•	Carry a number of objects.
•	Pick up, drop, look at, and use various objects.
*/

package adventure;

public class Adventurer {
public 	int X; // X coordinate position of the adventurer
public int Y; // Y coordinate position of the adventurer

public Adventurer (){
	this.X = 0;
	this.Y = 0;
}

public void MoveNorth(){
	X = X-1;
	if (X < 0) {
		X = 0;
		System.out.println("The adventurer cannot move north anymore.");
		System.out.println();
	}
	
}

public void MoveSouth(){
	X = X+1;
	if (X > 4) {
		X = 4;
		System.out.println("The adventurer cannot move south anymore.");
		System.out.println();
	}
	
}

public void MoveWest() {
	Y = Y-1;
	if (Y < 0){
		Y = 0;
		System.out.println("The adventurer cannot move west anymore.");
		System.out.println();
	}
	
}

public void MoveEast() {
	Y = Y+1;
	if (Y > 4){
		Y = 4;
		System.out.println("The adventurer cannot move east anymore.");
		System.out.println();
	}
	
}

}
