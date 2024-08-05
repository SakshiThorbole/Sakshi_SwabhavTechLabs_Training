package com.aurionpro.behavioural.state.test;

import com.aurionpro.behavioural.observer.model.*;
import com.aurionpro.behavioural.state.model.Ordered;
import com.aurionpro.behavioural.state.model.Packet;

public class PacketTest {

    public static void main(String[] args) {
        Packet packet = new Packet(new Ordered());

        packet.printCurrentState();  

        packet.goToNextState();
        packet.printCurrentState();  

        packet.goToNextState();
        packet.printCurrentState();  
        
        packet.goToNextState();
        
        packet.goToPreviousState();
    }
}
