package com.aurionpro.behavioural.state.model;

public class Delivered implements IPacketState {

    @Override
    public void current(Packet packet) {
        System.out.println("Current state: Delivered");
    }

    @Override
    public void next(Packet packet) {
        System.out.println("No next state");
    }

    @Override
    public void previous(Packet packet) {
        packet.setState(new Shipped());
        System.out.println("Packet moved to shipped state.");
    }
}
