package TextGame;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class SandSlash extends Pokemons {

public SandSlash(int x, int y){
	this.Description = "Ground type Pokemon, has very sharp claws";
	this.setCut();
	this.setRockSmash();
	this.setX(x);
	this.setY(y);
	this.setName("Sandslash");
}

public void showDialogue(Adventurer Ditto){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("<Sandslash>: Hey what's up? You need help getting past these rocks and trees ahead?");
	try {
		TimeUnit.SECONDS.sleep(2);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println("<Sandslash>: Hmm... I can help you get rid of them but that will be too boring.");
	try {
		TimeUnit.SECONDS.sleep(2);
		
	} catch (InterruptedException e) {
		e.printStackTrace();}
		
	System.out.println("<Sandslash>: Here, if you win against me in a game of rock-paper-scissors, I'll let you transform into me. How's that?");
	System.out.println("YES/NO");
	String Res = "";
	Res = sc.nextLine();
	
	while(!Res.equalsIgnoreCase("yes") && !Res.equalsIgnoreCase("no")){
		System.out.println("<Sandslash>: yes or no?");
		Res = sc.nextLine();
	}
	
	if(Res.equalsIgnoreCase("yes")){
		System.out.println("<Sandslash>: Rock, paper, scissors...");
		System.out.println("Rock/Paper/Scissors");
		Res = sc.nextLine();
		
		while(!Res.equalsIgnoreCase("rock") && !Res.equalsIgnoreCase("paper") && !Res.equalsIgnoreCase("scissors")){
			System.out.println("Invalid Command");
			Res = sc.nextLine();
		}
		
		while(Res.equalsIgnoreCase("scissors")){
			System.out.println("<Sandslash>: Scissors! (draw)");
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException a) {
				a.printStackTrace(); }
			System.out.println("<Sandslash>: Rock, paper, scissors...");
			Res = sc.nextLine();
			while(!Res.equalsIgnoreCase("rock") && !Res.equalsIgnoreCase("paper") && !Res.equalsIgnoreCase("scissors")){
				System.out.println("Invalid Command");
				Res = sc.nextLine();
			}
		}
			
		if(Res.equalsIgnoreCase("paper")){
			System.out.println("<Sandslash>: Scissors! (lost)");
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException a) {
				a.printStackTrace(); }
			System.out.println("<Sandslash>: Wow, can't believe I won!");
			System.out.println("( " + Ditto.getName() + "lost 10 HP!)");
			System.out.println();
			Ditto.setHP(Ditto.getHP()-10);
		}
		
		if(Res.equalsIgnoreCase("Rock")){
			System.out.println("<Sandslash>: Scissors! (won)");
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException a) {
				a.printStackTrace(); }
			System.out.println("<Sandslash>: Woah nice, you are pretty good at this.");
			System.out.println("(Sandslash has been added to available transformations!)");
			Ditto.addTransfrom(this);
			System.out.println();
		}
	}
}

}
