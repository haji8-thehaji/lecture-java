import character.Cleric;
import character.Swordman;
import character.Wizard;
import command.ClericOnCommand;
import command.SwordmanOnCommand;
import command.WizardOnCommand;
import common.ActionButton;
import common.Command;
import common.GameCharacter;

public class Client {
	public static void main(String[] args) {
		Wizard wizard = new Wizard("white") ;
		Cleric cleric = new Cleric("live") ;
		Swordman swordman = new Swordman("strong") ;
		Command wizardOnCommand = new WizardOnCommand(wizard) ;
		Command swordmanOnCommand = new SwordmanOnCommand(swordman) ;
		Command clericOnCommand = new ClericOnCommand(cleric) ;

		GameCharacter targetCharacter = null;
				

		targetCharacter = swordman;
		ActionButton attackButton = new ActionButton(swordmanOnCommand) ;
		attackButton.pressed() ;
		targetCharacter.move();
		targetCharacter.attack();
				
		targetCharacter = wizard;
		attackButton.setCommand(wizardOnCommand) ;
		attackButton.pressed() ;
		targetCharacter.move();
		targetCharacter.attack();

		targetCharacter = cleric;
		attackButton.setCommand(clericOnCommand) ;
		attackButton.pressed() ;
		targetCharacter.move();
		targetCharacter.attack();
		
	}
}
