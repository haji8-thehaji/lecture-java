package common;
public class ActionButton {
	private Command theCommand ;	
	public ActionButton(Command theCommand) {
		setCommand(theCommand) ;
	}
	public void setCommand(Command newCommand) {
		this.theCommand = newCommand ;
	}
	public void pressed() {
		theCommand.execute() ;	
	}
}
