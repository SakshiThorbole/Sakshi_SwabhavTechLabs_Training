package com.aurionpro.behavioural.command.test;

import com.aurionpro.behavioural.command.model.ICommand;
import com.aurionpro.behavioural.command.model.Light;
import com.aurionpro.behavioural.command.model.LightOffCommand;
import com.aurionpro.behavioural.command.model.LightOnCommand;
import com.aurionpro.behavioural.command.model.RemoteControl;

public class LightTest {

	public static void main(String[] args) {
		Light livingRoomLight = new Light();

        ICommand lightOn = new LightOnCommand(livingRoomLight);
        ICommand lightOff = new LightOffCommand(livingRoomLight);
		
		RemoteControl remote = new RemoteControl();
		
		remote.setCommand(lightOn);
		remote.pressButton();
		
		remote.setCommand(lightOff);
		remote.pressButton();

	}

}
