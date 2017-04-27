package TextGame;

public class ppRestore extends Items {

private String  functionToString;

public ppRestore(int x, int y){
this.setDescription("Potion that restores PP for ability: transform by 2");
this.setName("PP Restore");
this.functionToString = "restored 2 PP";
this.setX(x);
this.setY(y);
}

public void function(Adventurer Ditto){
Ditto.setPP(Ditto.getPP() + 2);
}

public String functionToString(){
	return functionToString;
}


}
