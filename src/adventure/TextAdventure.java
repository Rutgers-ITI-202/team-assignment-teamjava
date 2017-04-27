/*
This class:
•	Contains the main method used to start the game.
•	Talks to the AdventureModel and to the Adventurer classes, as needed.
*/

package adventure;

import java.util.*;
import java.util.StringTokenizer;

public class TextAdventure {

	public static void showMenu(){
		System.out.println("[Commands]:" + "\n" + "MOVEMENT: MoveNorth/n, MoveSouth/s, MoveEast/e, MoveWest/w" + "\n" + "VIEW: ViewInventory, ViewStatus, ViewTransform" + "\n" + "ACTIONS: Look, LookAround, Talk, Pick, Use, Give, Transform" + "\n" + "MENU: Help");
		System.out.println();
	}
	
	
	public static void main(String [] args){
		boolean hasCandy = false; // End game Determination
		Scanner sc = new Scanner (System.in);
		String response = "";
		System.out.println("Ditto's Great Adventure");
		System.out.println("This is the story of you, Ditto who is looking for a 'Rare Candy' that was left behind by an unknown Pokemon trainer.");
		System.out.println("Would you like to give yourself a nick name? YES/NO");
		response = sc.nextLine();
		Adventurer Ditto = new Adventurer();
		
		do {
		if(response.equalsIgnoreCase("yes")){
			System.out.println("Enter your nickname: ");
			response = sc.nextLine();
			Ditto.setName(response);
			break;
		}
		
		if(response.equalsIgnoreCase("no")) {
			System.out.println("You will be referred to as 'Ditto' by default.");
			System.out.println();
		}
		
		else
		{
			System.out.println("Please enter either YES or NO");
			response = sc.nextLine();
		}
		} while(!response.equalsIgnoreCase("yes") && !response.equalsIgnoreCase("no"));
	
		System.out.println(Ditto.getName() + ", it is your destiny to find the legendary 'Rare Candy' that is hidden in some room. As you might know, the Pokemon world is large and full of obstacles.");
		System.out.println("However, remember that you are a Ditto. Do not forget about what you are capable of, and make your way to the room that contains the 'Rare Candy'!");
		System.out.println();
		showMenu();
		
		StageOne stageOne = new StageOne();
		Room Current = new Room("");
		Current = stageOne;
		
	
		System.out.println("You start off your adventure at " + Current.getDescription());
		System.out.println();
		System.out.println(Current.displayRoom(Ditto));
		
		
		while(hasCandy == false){
			System.out.println("Command: ");
			response = sc.nextLine();
			boolean ValidCommand = false; // checker instance 
			
			if(response.replaceAll(" ", "").equalsIgnoreCase("Help")){
				showMenu();
				ValidCommand = true;
			}
			
			if(response.replaceAll(" ", "").equalsIgnoreCase("MoveNorth") || response.equalsIgnoreCase("n")){
				ValidCommand = true;
				Ditto.MoveNorth(Current);
				if(Current.tpCheck(Ditto) == true){
					Current = Current.teleport(Ditto);
				}
			}
			
			if(response.replaceAll(" ", "").equalsIgnoreCase("MoveSouth") || response.equalsIgnoreCase("s")){
				ValidCommand = true;
				Ditto.MoveSouth(Current);
				if(Current.tpCheck(Ditto) == true){
					Current = Current.teleport(Ditto);
				}
				
			}
			
			if(response.replaceAll(" ", "").equalsIgnoreCase("MoveWest") || response.equalsIgnoreCase("w")){
				ValidCommand = true;
				Ditto.MoveWest(Current);
				if(Current.tpCheck(Ditto) == true){
					Current = Current.teleport(Ditto);
				}
			}
			
			if(response.replaceAll(" ", "").equalsIgnoreCase("MoveEast") || response.equalsIgnoreCase("e")){
				ValidCommand = true;
				Ditto.MoveEast(Current);
				if(Current.tpCheck(Ditto) == true){
					Current = Current.teleport(Ditto);
				}
			}
			
			if(response.toLowerCase().contains("talk")){
				boolean talked = false; // checker to see if dialogue was initiated
				ValidCommand = true;
				for(int i = 0; i < Current.getPokemons().size(); i++){
					if(Ditto.getX() == Current.getPokemons().get(i).getX() && Ditto.getY() == Current.getPokemons().get(i).getY()){
						System.out.println("Talk to <" + Current.getPokemons().get(i).getName() + ">? YES/NO");
						response = sc.nextLine();
						
						while(!response.equalsIgnoreCase("yes") && !response.equalsIgnoreCase("no")){
							System.out.println("YES/NO?");
							response = sc.nextLine();
						}
						
					if(response.equalsIgnoreCase("Yes")){
						Ditto.Talk(Current.getPokemons().get(i));
						talked = true;
					}
					
					else {
						System.out.println("Action Cancelled");
						talked = true;
					}
				}
			}
				if(talked == false){
					System.out.println("There is no one here to talk to!");
				}
				talked = false;
			} // End of talk
		
			
			if(response.replaceAll(" ", "").equalsIgnoreCase("Transform")){
				
				ValidCommand = true;
				
				if(Ditto.getTransform().isEmpty()){
					System.out.println("There are no transformations available right now!");
					System.out.println();
				}
				
				else{
					System.out.println("Transform into... (enter name of target pokemon)");
					Ditto.viewTransform();
					String Res = "";
					Res = sc.nextLine();
					Ditto.transform(Res);
					
				}
			} // end of transform
			
			if(response.replaceAll(" ", "").equalsIgnoreCase("ViewTransform")){
				ValidCommand = true;
				Ditto.viewTransform();
			} // end of viewTransform
			
			if(response.replaceAll(" ", "").equalsIgnoreCase("ViewStatus")){
				ValidCommand = true;
				Ditto.showStatus();
			} // end of viewStatus
			
			if(response.replaceAll(" ", "").equalsIgnoreCase("ViewInventory")){
				ValidCommand = true;
				Ditto.ViewInventory();
			} // end of viewInventory
			
			if(response.replaceAll(" ", "").equalsIgnoreCase("LookAround")){
				ValidCommand = true;
				System.out.println(Ditto.getName() + " takes a look around its surroundings...");
				System.out.println(Current.getDescription());
				System.out.println();
			} // end of lookAround
			
			if(response.replaceAll(" ", "").equalsIgnoreCase("Look")){
				
			ValidCommand = true;
			boolean lookedAtSomething = false;
			for(int i = 0; i < Current.getPokemons().size(); i++){
				if(Ditto.getX() == Current.getPokemons().get(i).getX() && Ditto.getY() == Current.getPokemons().get(i).getY()){
					System.out.println(Ditto.getName() + " takes a look at " + Current.getPokemons().get(i).getName() + "...");
					System.out.println(Current.getPokemons().get(i).getDescription());
					System.out.println();
					lookedAtSomething = true;
				}
			} // Pokemon case
			
			for(int j = 0; j < Current.getItems().size(); j++){
				if(Ditto.getX() == Current.getItems().get(j).getX() && Ditto.getY() == Current.getItems().get(j).getY()){
					System.out.println(Ditto.getName() + " takes a look at " + Current.getItems().get(j).getName() + "...");
					System.out.println(Current.getItems().get(j).getDescription());
					System.out.println();
					lookedAtSomething = true;
				}
			} // Item case
			
			if(lookedAtSomething == false){
				System.out.println("There is nothing to look at here!");
				System.out.println();	
			}
			} // end of Look
			
			if(response.replaceAll(" ", "").equalsIgnoreCase("Use")){
				
			ValidCommand = true;
			if(Ditto.getInventory().isEmpty()){
				System.out.println("The inventory is empty!");
				System.out.println();
			}
			else{
			Ditto.ViewInventory();
			System.out.println("Enter name of the item that you want to use: ");
			String Res = "";
			Res = sc.nextLine();
			if(Res.replaceAll(" ", "").equalsIgnoreCase("pokeflute")){
				Ditto.UseFlute(Ditto, Current);
			}
			else{
			Ditto.Use(Res, Ditto);
			}
			}
			} // end of Use
			
			if(response.replaceAll(" ", "").equalsIgnoreCase("pick")){
				ValidCommand = true;
				Ditto.Pick(Current);
			}
			
			// END OF COMMANDS IMPLEMENTATION
			if(ValidCommand == false){
				System.out.println("Command not understood, nothing happened!");
				System.out.println();
			}
			
			System.out.println(Current.displayRoom(Ditto));
			ValidCommand = false;
		}
		
	} 
}
