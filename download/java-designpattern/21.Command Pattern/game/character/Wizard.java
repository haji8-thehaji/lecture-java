package character;

import common.GameCharacter;

public class Wizard extends GameCharacter{

    public Wizard(String name) {
        super(name);
		this.gameClass = "Wizard";
    }
	public void iceBall() {
		System.out.println("iceBall") ;
	}
	public void fireBall() {
		System.out.println("fireBall") ;
	}
	public void mudWall() {
		System.out.println("mudWall") ;
	}
	@Override
	public void attack() {
		System.out.println(" attack2");
	}
}
  