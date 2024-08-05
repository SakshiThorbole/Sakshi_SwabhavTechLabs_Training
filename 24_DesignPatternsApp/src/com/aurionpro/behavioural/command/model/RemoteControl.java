package com.aurionpro.behavioural.command.model;

public class RemoteControl {                         // Invoking Class
	private ICommand command;

	
	public void setCommand(ICommand command) {
		this.command = command;
	}
	
	public void pressButton() {
        command.execute();
    }
	

}
