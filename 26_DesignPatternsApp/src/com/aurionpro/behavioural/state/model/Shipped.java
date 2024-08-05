package com.aurionpro.behavioural.state.model;

public class Shipped implements IPacketState {

    @Override
    public void current(Packet packet) {
        System.out.println("Current state: Shipped");
    }

    @Override
    public void next(Packet packet) {
        packet.setState(new Delivered());
        System.out.println("Packet moved to delivered state.");
    }

    @Override
    public void previous(Packet packet) {
        packet.setState(new Ordered());
        System.out.println("Packet moved to ordered state.");
    }
}
