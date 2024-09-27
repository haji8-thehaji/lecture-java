package command;
import character.Cleric;
import common.Command;

public class ClericOnCommand implements Command {
	private Cleric TheCleric;
	public ClericOnCommand(Cleric TheCleric) {
		this.TheCleric = TheCleric ;
	}
	public void execute() {
		TheCleric.heal();
	}
}
