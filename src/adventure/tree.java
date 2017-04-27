package adventure;

public class tree extends obstacle {
	public tree(int x, int y){
		super(x, y);
		this.setDescription("Tall tree ahead, if only I can use 'Cut' to get across");
		this.passAbility = "Cut";
	}
	

}
