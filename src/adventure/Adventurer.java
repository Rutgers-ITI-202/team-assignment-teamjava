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
import java.util.*;

public class Adventurer extends Pokemons {
private String name; // Given name to the adventurer
private 	int X; // X coordinate position of the adventurer
private int Y; // Y coordinate position of the adventurer
private ArrayList<Items> inventory; // Arraylist that stores the Adventurer's items
private Pokemons [] TransformList; // Array that sotres Pokemons objects
private int PP;
private int HP;
private int level;
private int maxHP;

private int worldX; // Adventurer's X coordinate on the world map
private int worldY; // Adventurer's Y coordinate on the world map

public Adventurer (){
	
	this.X = 0;
	this.Y = 0;
	this.name = "Ditto";
	this.inventory = new ArrayList();
	this.TransformList = new Pokemons[6]; // the adventurer can transform into a maximum of 6 pokemons
	
	this.worldX = 0;
	this.worldY = 0;
	this.level = 1;
	this.HP = 50;
	this.maxHP = 50;
	this.PP = 5;
}

public void setmaxHP(int x){
	maxHP = x;
}

public int getmaxHP(){
	return maxHP;
}

public void setHP(int x){
HP = x;	
}

public int getHP(){
	return HP;
}

public void setName(String NickName){
	name = NickName;
}

public String getName(){
	return name;
}

public void setX(int x){
	X = x;
}

public int getX(){
	return X;
}

public void setY(int y){
	Y = y;
}

public int getY(){
	return Y;
}

public void setWorldX(int x){
	worldX = x;
}

public int getWorldX(){
	return worldX;
}

public void setWorldY(int y){
	worldY = y;
}

public int getWorldY(){
	return worldY;
}

public void transform(Pokemons target){
	
}

public void Pick (Items item){ // Adds item object to inventory ArrayList.
if(item.getX() == X && item.getY() == Y){
	inventory.add(item);
	System.out.println(name + " picked up " + item.getName() + "!");
	item.setX(100); // the item is no longer on the grid
	item.setY(100);
}

else {System.out.println("There is nothing to pick up here" + "\n");}

}

public void ViewInventory(){ // Views inventory and prints toString representation of inventory ArrayList.
	System.out.println(name + "'s inventory: ");
	
	if(inventory.isEmpty() == true){
		System.out.println("Empty");
	}
	else{
	for(int i = 0; i < inventory.size(); i++){
		System.out.print(inventory.get(i).getName() + " ");
	}
	System.out.println();
	}
}

public void Use(String item, Adventurer Ditto){
for(int i = 0; i < inventory.size(); i++){
if(inventory.get(i).getName().replaceAll(" ", "").equalsIgnoreCase(item.trim().replaceAll(" ", ""))){

if((inventory.get(i)) instanceof sitrusBerry){
((sitrusBerry) inventory.get(i)).function(Ditto);
}
}

// add other instances of items here

else{
System.out.println("Item does not exist...");
break;
}

System.out.println(name + " used " +  ((sitrusBerry) inventory.get(i)).getName() + " and " + ((sitrusBerry) inventory.get(i)).functionToString());
inventory.remove(i);
break;

}
}

public void checkPass(obstacle ob) { // determines if the adventurer has the ability to pass an obstacle

if(ob instanceof sky){
if(canFly() == true){
ob.setPassable();	
}
}



}


public void MoveNorth(Room room){ //Updates Adventurer's X coordinate (-1), parameter of type Room for array boundaries
	
	X = X-1;
	if (X < 0) {
		X = 0;
		System.out.println("The adventurer cannot move north anymore.");
		System.out.println();
	}
	
	for(int i = 0; i < room.getObstacles().size(); i++){
		if(X == room.getObstacles().get(i).getX() && Y == room.getObstacles().get(i).getY()){
			checkPass(room.getObstacles().get(i));
			if(room.getObstacles().get(i).seePass() == false){
				X = X +1;
				System.out.println(room.getObstacles().get(i).getDescription());
			}
		}
	}
	
}

public void MoveSouth(Room room){ //Updates Adventurer's X coordinate (+1)
	X = X+1;
	if (X > room.getArray()[0].length-1) {
		X = X-1;
		System.out.println("The adventurer cannot move south anymore.");
		System.out.println();
	}
	
	for(int i = 0; i < room.getObstacles().size(); i++){
		if(X == room.getObstacles().get(i).getX() && Y == room.getObstacles().get(i).getY()){
			checkPass(room.getObstacles().get(i));
			if(room.getObstacles().get(i).seePass() == false){
				X = X - 1;
				System.out.println(room.getObstacles().get(i).getDescription());
			}
		}
	}
	
}

public void MoveWest(Room room) { //Updates Adventurer's Y coordinate (-1)
	Y = Y-1;
	if (Y < 0){
		Y = 0;
		System.out.println("The adventurer cannot move west anymore.");
		System.out.println();
	}
	
	for(int i = 0; i < room.getObstacles().size(); i++){
		if(X == room.getObstacles().get(i).getX() && Y == room.getObstacles().get(i).getY()){
			checkPass(room.getObstacles().get(i));
			if(room.getObstacles().get(i).seePass() == false){
				Y = Y + 1;
				System.out.println(room.getObstacles().get(i).getDescription());
			}
		}
	}
	
}

public void MoveEast(Room room) { //Updates Adventurer's Y coordinate (+1)
	Y = Y+1;
	if (Y > room.getArray()[0].length - 1){
		Y = Y-1;
		System.out.println("The adventurer cannot move east anymore.");
		System.out.println();
	}
	
	for(int i = 0; i < room.getObstacles().size(); i++){
		if(X == room.getObstacles().get(i).getX() && Y == room.getObstacles().get(i).getY()){
			checkPass(room.getObstacles().get(i));
			if(room.getObstacles().get(i).seePass() == false){
				Y = Y - 1;
				System.out.println(room.getObstacles().get(i).getDescription());
			}
		}
	}
	
}

public static void main(String [] args){

	sitrusBerry berry = new sitrusBerry();
	Adventurer Ditto = new Adventurer();
	Ditto.Pick(berry);
	Ditto.ViewInventory();
	Ditto.setHP(30);
	System.out.println(Ditto.getHP());
	Ditto.Use("sitrus berry", Ditto);
	System.out.println(Ditto.getHP());
	
}

}
