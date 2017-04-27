package adventure;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class squirtle extends Pokemons{


public squirtle(int x, int y){
	this.setX(x);
	this.setY(y);
	this.CanCut = false;
	this.CanDive = false;
	this.CanFly = false;
	this.CanRockSmash = false;
	this.CanSurf = false;
	this.Description = "Turtle-like water type pokemon, looks very intelligent with the pair of glasses its wearing.";
	this.setName("Squirtle");
}

public void showDialogue(Adventurer Ditto){
	
if(Ditto.currentForm.equalsIgnoreCase("zubat")){ // When ditto is in the form of 'zubat', dialogue is different
	Scanner sc = new Scanner(System.in);
	String res = "";
	System.out.println("<Squirtle>: My friend Zubat, is there something you want to know?");
	System.out.println("YES/NO");
	res = sc.nextLine();
	
	while(!res.equalsIgnoreCase("yes")&&!res.equalsIgnoreCase("no")){
		System.out.println("<Squirtle>: ...slow down man, what did you say?");
		res = sc.nextLine();
	}
	
	if(res.equalsIgnoreCase("yes")){
		System.out.println("<Squirtle>: You want to know about a Pokemon trainer and his 'Rare Candy'? hmm... let me see...");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(".");
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(".");
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(".");
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("<Squirtle>: Found it! The Pokemon trainer gave the 'Rare Candy' to his Snorlax, who is currently sleeping right outside of this cave!");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("<Squirtle>: Don't worry, Snorlax did not eat the candy yet. Hurry before it's too late!");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("<Squirtle>: Oh, and take this Poke Flute my friend, it will help you wake Snorlax up gently.");
		pokeflute flute = new pokeflute(100,100);
		Ditto.addToInventory(flute);
		System.out.println("(Ditto has recieved 'poke flute'!)");
		System.out.println();
	}
	
	if(res.equalsIgnoreCase("no")){
		System.out.println("<Squirtle>: Alright then, farewell.");
		System.out.println();
	}
	}

else{

Scanner sc = new Scanner (System.in);
String Res = "";
System.out.println("<Squirtle>: Welcome traveller, I am Squirtle the fortune teller, is there anything you want to know about?");
System.out.println("YES/NO");
Res = sc.nextLine();

while(!Res.equalsIgnoreCase("yes") && !Res.equalsIgnoreCase("no")){
System.out.println("<Squirtle>: Please speak slowly but loudly, I couldn't hear you clearly.");
Res = sc.nextLine();
}

if(Res.equalsIgnoreCase("yes")){
	System.out.println("<Squirtle>: Great, but fortune telling is a business, I cannot provide service without a payment.");
	try {
		TimeUnit.SECONDS.sleep(2);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println("<Squirtle>: A payment of 5 sitrus berries shall do.");
	System.out.println();
	System.out.println("(Give Squirtle 5 sitrus berries?) YES/NO");
	String second = "";
	second = sc.nextLine();
	
	if(second.equalsIgnoreCase("yes")){
		int Counter = 0;
		for(int i = 0; i < Ditto.getInventory().size(); i++){
		if(Ditto.getInventory().get(i) instanceof sitrusBerry){
			Counter++;
		}
	}
		if(Counter < 5){
			System.out.println("<Squirtle>: You don't have enough berries, let's talk later.");
			System.out.println();
			return;
		}
		
		else{
			Counter = 5;
			for(int i = 0; i < Ditto.getInventory().size(); i++){
				if(Ditto.getInventory().get(i) instanceof sitrusBerry){
					Ditto.getInventory().remove(i);
					Counter--;
				}
				if(Counter == 0){
				break;	
				}
			}
			
		System.out.println(Ditto.getName() + " gave Squirtle 5 sitrus berries.");
		System.out.println("<Squirtle>: You want to know about a Pokemon trainer and his 'Rare Candy'? hmm... let me see...");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(".");
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(".");
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(".");
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("<Squirtle>: Found it! The Pokemon trainer gave the 'Rare Candy' to his Snorlax, who is currently sleeping right outside of this cave!");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("<Squirtle>: Don't worry, Snorlax did not eat the candy yet. Hurry before it's too late!");
		System.out.println();
		}
		
	} // End of yes case
	
	else{
		System.out.println("Action Canceled");
		System.out.println();
		return;
	}

}

if(Res.equalsIgnoreCase("no")){
	System.out.println("Action Canceled");
	System.out.println();
}

}
}
}


