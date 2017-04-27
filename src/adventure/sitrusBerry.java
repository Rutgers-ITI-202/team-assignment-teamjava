package adventure;

public class sitrusBerry extends Items {

private String functionToString;
	
public sitrusBerry(int x, int y){
this.setDescription("Consumable berry that heals for 20 HP.");
this.setName("Sitrus Berry");
this.functionToString = ("healed for 20 HP");
this.setX(x);
this.setY(y);
}

public void function(Adventurer james){

james.setHP(james.getHP() + 20);

if(james.getHP() > james.getmaxHP()){
	james.setHP(james.getmaxHP());
}
}

public String functionToString(){
	return functionToString;
}



}
