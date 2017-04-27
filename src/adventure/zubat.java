package TextGame;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class zubat extends Pokemons{

private int DialogueCount;
	
public zubat(int x, int y){
	this.Description = "Bat-like pokemon, often seen in tunnels and caves. Seems like it knows how to use fly.";
	this.CanCut = false;
	this.CanDive = false;
	this.CanSurf = false;
	this.CanFly = true;
	this.CanRockSmash = false;
	this.setX(x);
	this.setY(y);
	this.setName("Zubat");
	this.DialogueCount = 0;
}

public void showDialogue(Adventurer Ditto){
	DialogueCount++;
	System.out.println("<Zubat>: ......");
	
	try {
		TimeUnit.SECONDS.sleep(2);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	System.out.println("(Zubat used absorb on " + Ditto.getName() + ", " + Ditto.getName() + " lost 10 HP!)" );
	Ditto.setHP(Ditto.getHP()-10);
	System.out.println();
	
	if(DialogueCount == 3){
		System.out.println("<Zubat>: ...Thank you for letting me absorb some HP, I was defeated by a Pokemon trainer just a few minutes ago.");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("<Zubat>: The trainer? I'm not sure but I think he went South... You should go ask my friend Squirtle who lives in the East side of the cave, he's a fortune teller and he knows everything!");
		
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("<Zubat>: Once again thanks for the help. Here, take some berries with you!");
		System.out.println("(Recieved 5 Sitrus Berries from Zubat)");
		System.out.println("(Zubat has been added to available transformations!)");
		System.out.println();
		Ditto.addTransfrom(this);
		sitrusBerry b1 = new sitrusBerry(Ditto.getX(), Ditto.getY());
		sitrusBerry b2 = new sitrusBerry(Ditto.getX(), Ditto.getY());
		sitrusBerry b3 = new sitrusBerry(Ditto.getX(), Ditto.getY());
		sitrusBerry b4 = new sitrusBerry(Ditto.getX(), Ditto.getY());
		sitrusBerry b5 = new sitrusBerry(Ditto.getX(), Ditto.getY());
		
		Ditto.addToInventory(b1);
		Ditto.addToInventory(b2);
		Ditto.addToInventory(b3);
		Ditto.addToInventory(b4);
		Ditto.addToInventory(b5);
		
	}
	
}

}
