package adventure;

public class Lapras extends Pokemons {

	public Lapras (){
		this.name = "Lapras";
		this.X = 0;	
		this.Y = 0;
		this.CatchRate = 40; // 40% catch rate
		this.Ability = "SURF";
		this.Description = "Lapras, this pokemon knows how to use ability " + Ability + "."; 
		this.CanCut = false;
		this.CanDive = false;
		this.CanRockSmash = false;
		this.CanSurf = true;
	}
}
