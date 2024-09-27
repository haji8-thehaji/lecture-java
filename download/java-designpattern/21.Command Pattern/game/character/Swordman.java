package character;

import common.GameCharacter;

public class Swordman extends GameCharacter{

    public Swordman(String name) {
        super(name);
		this.gameClass = "Swordman";
    }
	public void slash() {
		System.out.println("slash") ;
	}
	@Override
	public void attack() {
		System.out.println(" attack2");
	}
}
