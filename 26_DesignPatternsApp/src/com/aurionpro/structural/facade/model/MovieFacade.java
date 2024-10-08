package com.aurionpro.structural.facade.model;

	public class MovieFacade {

	    private DVDPlayer dvdPlayer;
	    private SoundSystem soundSystem;
	    private Projector projector;

	    public MovieFacade() {
	        this.dvdPlayer = new DVDPlayer();
	        this.soundSystem = new SoundSystem();
	        this.projector = new Projector();
	    }

	    public void startMovie(String movie, String volume) {
	        System.out.println("Starting the movie...");
	        dvdPlayer.setMovie(movie);
	        soundSystem.setVolume(volume);
	        dvdPlayer.on();
	        soundSystem.on();
	        projector.on();
	        System.out.println("Movie " + dvdPlayer.getMovie() + " is now playing at volume " + soundSystem.getVolume() + ".");
	    }

	    public void stopMovie() {
	        System.out.println("Stopping the movie...");
	        // Assuming you have off methods implemented in each class
	        // dvdPlayer.off();
	        // soundSystem.off();
	        // projector.off();
	        System.out.println("Movie has been stopped.");
	    }
	}

