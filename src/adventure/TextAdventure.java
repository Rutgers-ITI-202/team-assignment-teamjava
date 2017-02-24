/*
This class:
•	Contains the main method used to start the game.
•	Talks to the AdventureModel and to the Adventurer classes, as needed.
*/

package adventure;

public class TextAdventure {

	public static void main(String [] args){
		Scanner sc = new Scanner (System.in);
		String response = "";
		
		Room One = new Room();
		System.out.println("Enter your name: ");
		response = sc.nextLine();
		Adventurer james = new Adventurer();
		james.name = response;
		Pokemons Pika = new Pokemons();
		
		System.out.println("Welcome adventurer " + james.name + ".");
		System.out.print("\n");
		System.out.println(One.getDescription());
		System.out.print("\n");
		System.out.println(One.displayRoom(james, Pika));
		james.MoveWest();
		james.MoveEast();
		james.MoveSouth();
		james.ViewInventory();
		james.Pick("Water");
		james.Pick("Potion");
		james.ViewInventory();
	}

}
