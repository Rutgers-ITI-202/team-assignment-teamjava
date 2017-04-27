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

}
