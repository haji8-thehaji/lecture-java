package common;

public class GameCharacter implements MoveBehavor, AttackBehavor{
    
	public String name = "";
	public String gameClass = "";
	public GameCharacter(String name){
		this.name = name;
	}

	public  String getGameClass(){
		return gameClass;
	}
	public  String getName(){
		return name;
	}

	@Override
	public void move() {
		System.out.println(getGameClass() + " move");
	}

	@Override
	public void attack() {
		System.out.println(getName() + " attack");
	}
}
