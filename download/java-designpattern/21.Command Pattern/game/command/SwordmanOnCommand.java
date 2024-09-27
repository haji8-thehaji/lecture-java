package command;
import character.Swordman;
import common.Command;

public class SwordmanOnCommand implements Command {
	private Swordman theSwordman ;
	public SwordmanOnCommand(Swordman theSwordman) {
		this.theSwordman = theSwordman ;
	}
	public void execute() {
		theSwordman.slash();
	}

}
