package command;
import common.Command;
import mode.Cleric;

public class ClericOnCommand implements Command {
	private Cleric TheHeal;
	public ClericOnCommand(Cleric TheHeal) {
		this.TheHeal = TheHeal ;
	}
	public void execute() {
		TheHeal.heal();
	}
}
