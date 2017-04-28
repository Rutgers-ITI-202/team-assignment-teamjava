package adventure;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class snorlax extends Pokemons {
	protected boolean Gentle; // determines whether Snorlax was gently waken up by a poke flute or not.
	
	
	public snorlax(int x, int y){
	this.setX(x);
	this.setY(y);
	this.CanCut = false;
	this.CanDive = false;
	this.CanFly = false;
	this.CanRockSmash = false;
	this.CanSurf = true;
	this.setName("Snorlax");
	this.Description="Snorlax's typical day consists of nothing more than eating and sleeping.";
	this.Gentle = false;
	}
	
	public void showDialogue(Adventurer Ditto){
		if(Gentle == false){
			
			Scanner sc = new Scanner(System.in);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("<Snorlax>: ......!!");
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("<Snorlax>: How dare you wake me up like that?");
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("You are not kind, I will not tell you anything unless you give me 10 sitrus berries!");
			System.out.println("(Give Snorlax 10 sitrus berries? YES/NO)");
			String res = "";
			res = sc.nextLine();
			
			if(res.equalsIgnoreCase("yes")){
				int Counter = 0;
				for(int i = 0; i < Ditto.getInventory().size(); i++){
				if(Ditto.getInventory().get(i) instanceof sitrusBerry){
					Counter++;
				}
			}
				if(Counter < 10){
					System.out.println("<Snorlax>: You don't have enough berries, liar!");
					System.out.println();
					return;
				}
				
				else{
					Counter = 10;
					for(int i = 0; i < Ditto.getInventory().size(); i++){
						if(Ditto.getInventory().get(i) instanceof sitrusBerry){
							Ditto.getInventory().remove(i);
							Counter--;
						}
						if(Counter == 0){
						break;	
						}
					}
					System.out.println("(" + Ditto.getName() + " gave 10 Sitrus Berries to Snorlax.)");
					System.out.println("<Snorlax>: You are not a bad Pokemon afterall! Thanks alot!");
					try {
						TimeUnit.SECONDS.sleep(2);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("<Snorlax>: You are looking for 'Rare Candy'? This small, blue thing?");
					System.out.println("(Snorlax shows you his Rare Candy)");
					try {
						TimeUnit.SECONDS.sleep(2);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("<Snorlax>: My trainer told me to eat it, but it doesn't look that tasty.");
					try {
						TimeUnit.SECONDS.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("<Snorlax>: Here, you can have it if you want :)");
					System.out.println("(Snorlax gave you Rare Candy!)");
					Ditto.hasCandy = true;
					System.out.println();
					System.out.println("END:" + "\n" + "This marks the end of Ditto's Great Adventure, thanks for helping Ditto find its way to the end!");
					System.out.println();
		}
		
		
	} // end of yes
	
			else{
				System.out.println("Action Canceled");
				System.out.println();
				return;
			}
} // end of NOT gentle case
		
		else if(Gentle == true){
			System.out.println("<Snorlax>: ....");
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("<Snorlax>: That was a beautiful melody, I have never felt so much energy after waking up.");
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("<Snorlax>: You are looking for 'Rare Candy'? This small, blue thing?");
			System.out.println("(Snorlax shows you his Rare Candy)");
			
			try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("<Snorlax>: My trainer told me to eat it, but it doesn't look that tasty.");
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("<Snorlax>: Here, you can have it if you want :)");
			System.out.println("(Snorlax gave you Rare Candy!)");
			Ditto.hasCandy = true;
			System.out.println("END:" + "\n" + "This marks the end of Ditto's Great Adventure, thanks for helping Ditto find its way to the end!");
		} // End of gentle case
}
	
}
