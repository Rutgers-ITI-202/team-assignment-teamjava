package TextGame;
import java.util.*;

public class Pokemons {
public int X;
public int Y;
public double CatchRate; //double value that determines how likely a pokemon could be caught using a pokemon
public String Description; //String that describes the pokemon 
public String Ability; //String representation of a pokemon's abilities
public String name; //Name of the pokemon Stored as a String
public boolean CanSurf; //boolean that determines if a pokemon can use ability: Surf
public boolean CanCut; //boolean that determines if a pokemon can use ability: Cut 
public boolean CanRockSmash; //boolean that determines if a pokemon can use ability: Rock Smash
public boolean CanDive; //boolean that determines if a pokemon can use ability: Dive

public Pokemons () {
this.X = 4;	
this.Y = 4;
this.CatchRate = 50; // 50% catch rate
this.Ability = "CUT";
this.Description = "[name of pokemon], this pokemon knows how to use ability " + Ability + "."; 
this.name = "First Pokemon";
this.CanCut = true;
this.CanDive = false;
this.CanRockSmash = false;
this.CanSurf = false;
}

}
