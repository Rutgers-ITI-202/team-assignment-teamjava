package TextGame;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Lapras extends Pokemons {

public Lapras(int x, int y){
this.Description = "Lapras, aquatic Pokemon that is big in its size. Seems like a kind hearted Pokemon.";
this.setSurf();
this.setX(x);
this.setY(y);
this.setName("Lapras");
}

public void showDialogue(Adventurer james){
	System.out.println("<Lapras>: Hi Ditto, do you need any help....?");
	System.out.println("YES/NO");
	Scanner sc = new Scanner(System.in);
	String Res = "";
	Res = sc.nextLine();
	while(!Res.equalsIgnoreCase("yes") && !Res.equalsIgnoreCase("no")){
		System.out.println("<Lapras>: Sorry, I miseed what you just said...");
		System.out.println();
	} 

	if(Res.equalsIgnoreCase("yes")){
		boolean hasBerry = false;
		System.out.println("<Lapras>: I see, you want to get across the river...");
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("<Lapras>: I really want to help you...but I am too hungry to even move right now...");
		System.out.println();
		
		if(!james.getInventory().isEmpty()){
			for(int i = 0; i < james.getInventory().size(); i++){
				if(james.getInventory().get(i) instanceof sitrusBerry){
				hasBerry = true;	
				}
			}
		}
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		if(hasBerry == true){
			System.out.println("<Lapras>: Could you give me something to eat?");
			System.out.println("(Give Lapras Sitrus Berry?) YES/NO");
			Res = sc.nextLine();
			if(Res.equalsIgnoreCase("yes")){
				System.out.println(james.getName() + " gave sitrus berry to Lapras!");
				
				for(int i = 0; i < james.getInventory().size(); i++){
					if(james.getInventory().get(i) instanceof sitrusBerry){
					james.getInventory().remove(i);
					}
				}
				
				try {
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("<Lapras>: Thank you so much, I feel much better now. You have my permission to transform into me now, go ahead!");
				james.addTransfrom(this);
				try {
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("(Lapras has been added to list of available transformations!)");
				System.out.println();
			}
		}
	}
	
	else if(Res.equalsIgnoreCase("no")){
		System.out.println("<Lapras> See you later...");
		System.out.println();
	}
}


public static void main(String [] args){
	Adventurer james = new Adventurer();
	SandSlash sand = new SandSlash(0,0);
	james.Talk(sand);
}

}
