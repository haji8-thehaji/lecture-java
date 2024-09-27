package command;
import character.Wizard;
import common.Command;

public class WizardOnCommand implements Command {
	private Wizard TheWizard;
	public WizardOnCommand(Wizard TheWizard) {
		this.TheWizard = TheWizard ;
	}
	public void execute() {
		TheWizard.iceBall();
	}
}
