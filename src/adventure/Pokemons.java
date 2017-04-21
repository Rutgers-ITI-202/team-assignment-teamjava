package adventure;
import java.util.*;

public class Pokemons {
private int X;
private int Y;

public String Description; //String that describes the pokemon
public String dialogue;

private String Ability; //String representation of a pokemon's abilities
private String name; //Name of the pokemon Stored as a String
private boolean CanSurf; //boolean that determines if a pokemon can use ability: Surf
private boolean CanCut; //boolean that determines if a pokemon can use ability: Cut 
private boolean CanRockSmash; //boolean that determines if a pokemon can use ability: Rock Smash
private boolean CanDive; //boolean that determines if a pokemon can use ability: Dive
private boolean CanFly;

public Pokemons () {
this.X = 0;	
this.Y = 1;
this.dialogue = "Hi, I am" + name + ", nice to meet you!";
this.Ability = "CUT";
this.Description = "[name of pokemon], this pokemon knows how to use ability " + Ability + "."; 
this.name = "First Pokemon";
this.CanCut = false;
this.CanDive = false;
this.CanRockSmash = false;
this.CanSurf = false;
this.CanFly = false;
}

public void setName(String N){
	name = N;
}

public String getName(){
	return name;
}

public boolean canSurf(){
	return CanSurf;
}

public boolean canCut(){
	return CanCut;
}

public boolean canRockSmash(){
	return CanRockSmash;
}

public boolean canFly(){
	return CanFly;
}

public void setFly(){
	CanFly = true;
}

public void setSurf(){
	CanSurf = true;
}

public void setRockSmash(){
	CanRockSmash = true;
}

public void setCut(){
	CanCut = true;
}

public void setX(int x){
	X = x;
}

public void setY(int y){
	Y = y;
}

public int getX(){
	return X;
}

public int getY(){
	return Y;
}

public static void main(String [] args){

}

}
