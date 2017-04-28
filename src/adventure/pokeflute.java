package adventure;

public class pokeflute extends Items{

	private String functionToString;
	
	public pokeflute(int x, int y){
	
	this.setX(x);
	this.setY(y);
	this.setName("Poke Flute");
	this.setDescription("Flute that produces beautiful melodies when played.");
	this.functionToString = "Snorlax has been waken up gently and slowly opened its eyes.";
	}



public String functionToString(){
	return functionToString;
}

public void function(Adventurer Ditto, Room room){
	boolean SnorlaxFound = false;
	for(int i = 0; i < room.getPokemons().size(); i ++){
		if(room.getPokemons().get(i) instanceof snorlax && Ditto.getX() == room.getPokemons().get(i).getX() && Ditto.getY() == room.getPokemons().get(i).getY()){
			((snorlax)(room.getPokemons().get(i))).Gentle = true;
			SnorlaxFound = true;
			System.out.println(Ditto.getName() + " used poke flute, Snorlax is gently waken up and slowly opened its eyes!");
			System.out.println();
		}
	}
	
	if(SnorlaxFound == false){
		System.out.println("You cannot use poke flute here!");
		System.out.println();
	}
}

}
