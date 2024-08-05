package com.aurionpro.behavioural.state.model;

public interface IPacketState {
	void current(Packet packet);
	void next(Packet packet);
	void previous(Packet packet);
	

}
