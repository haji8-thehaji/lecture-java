import command.ClericOnCommand;
import command.SwordmanOnCommand;
import command.WizardOnCommand;
import common.ActionButton;
import common.Command;
import mode.Cleric;
import mode.Swordman;
import mode.Wizard;

public class Client {
	public static void main(String[] args) {
		Wizard wizard = new Wizard() ;
		Cleric cleric = new Cleric() ;
		Swordman swordman = new Swordman() ;
		Command wizardOnCommand = new WizardOnCommand(wizard) ;
		Command swordmanOnCommand = new SwordmanOnCommand(swordman) ;
		Command clericOnCommand = new ClericOnCommand(cleric) ;
				
		Swordman alarm = new Swordman() ;
		ActionButton button2 = new ActionButton(swordmanOnCommand) ;
		button2.pressed() ;
				
		button2.setCommand(wizardOnCommand) ;
		button2.pressed() ;

		button2.setCommand(clericOnCommand) ;
		button2.pressed() ;
	}
}
