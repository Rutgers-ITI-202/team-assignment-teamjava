package adventure;

public class water extends obstacle {
	public water(int x, int y){
		super(x, y);
		this.setDescription("Water terrain ahead, if only I can use 'surf' to get across");
		this.passAbility = "Surf";
	}
	

}
