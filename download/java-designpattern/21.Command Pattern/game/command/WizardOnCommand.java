package command;
import common.Command;
import mode.Wizard;

public class WizardOnCommand implements Command {
	private Wizard TheMagic;
	public WizardOnCommand(Wizard TheMagic) {
		this.TheMagic = TheMagic ;
	}
	public void execute() {
		TheMagic.iceBall();
	}
}
