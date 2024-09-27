package character;

import common.GameCharacter;

public class Cleric extends GameCharacter{

    public Cleric(String name) {
        super(name);
		this.gameClass = "Cleric";
    }
	public void heal() {
		System.out.println("heal") ;
	}
	@Override
	public void attack() {
		System.out.println(" attack2");
	}
}
