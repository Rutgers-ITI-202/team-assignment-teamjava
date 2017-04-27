package adventure;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class pidgey extends Pokemons {

public pidgey(int x, int y){
this.Description = "Bird type Pokemon, seems like it knows how to use fly";
this.setFly();
this.setX(x);
this.setY(y);
this.setName("Pidgey");
}
	
public void showDialogue(Adventurer james){
	System.out.println("<Pidgey>: What's the problem Ditto? You want to get across the bridge?");
	System.out.println("YES/NO");
	Scanner sc = new Scanner(System.in);
	String Res = "";
	Res = sc.nextLine();

	while(!Res.equalsIgnoreCase("yes") && !Res.equalsIgnoreCase("no")){
		System.out.println("<Pidgey>: What did you say? Sorry the wind is too loud.");
	} 

	
	if(Res.equalsIgnoreCase("yes")){
	System.out.println("<Pidgey>: I can fly but as you can see, I am small and too weak to carry you across...");	

	try {
		TimeUnit.SECONDS.sleep(4);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	System.out.println("<Pidgey>: Oh wait, you're a Ditto right? Why don't you just transform into me so that you can fly across the broken bridge by yourself?");
	
	try {
		TimeUnit.SECONDS.sleep(4);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	System.out.println("<Pidgey>: Here, I grant you permission. Go ahead and use transform");
	james.addTransfrom(this);
	System.out.println("(Pidgey has been added to list of available transformations!)");
	System.out.println();
	} // yes case
	
	
	else if(Res.equalsIgnoreCase("no")){
		System.out.println("<Pidgey>: Alright then, the weather is pretty nice today.");
		System.out.println();
	} // no case
	
}
}
