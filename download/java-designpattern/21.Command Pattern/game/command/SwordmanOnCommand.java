package command;
import common.Command;
import mode.Swordman;

public class SwordmanOnCommand implements Command {
	private Swordman theAttack ;
	public SwordmanOnCommand(Swordman theAttack) {
		this.theAttack = theAttack ;
	}
	public void execute() {
		theAttack.Attack();
	}

}
