package com.aurionpro.behavioural.state.model;

public class Ordered implements IPacketState {

    @Override
    public void current(Packet packet) {
        System.out.println("Current state: Ordered");
    }

    @Override
    public void next(Packet packet) {
        packet.setState(new Shipped());
        System.out.println("Packet moved to shipped state.");
    }

    @Override
    public void previous(Packet packet) {
        System.out.println("No previous state");
    }
}
