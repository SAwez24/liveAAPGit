package com.demo.oops;

public class InterfaceEx {
	public static void main(String[] args) {
		MusicPlayer musicPlayer = new IPhone();
		musicPlayer.play();
		musicPlayer.pause();
		musicPlayer.changeTrack();

		musicPlayer = new CasettePlayer();
		musicPlayer.play();
		musicPlayer.pause();
		musicPlayer.changeTrack();
		
		musicPlayer = new Bird();
		musicPlayer.play();
		musicPlayer.pause();
		musicPlayer.changeTrack();
	}
}

// interfaces have abstract methods
// can be implemented by any class
interface MusicPlayer {
//	public abstract void play();
	public void play();

	public abstract void pause();

	public abstract void changeTrack();
//	Abstract methods do not specify a body
//	public void on() {
//		
//	}
}

class IPhone implements MusicPlayer {

	@Override
	public void play() {
		System.err.println("Press the on screen play button on screen or use play control on your ear phones");
		System.err.println("Play from cloud");
	}

	@Override
	public void pause() {
		System.err.println("Press the play button on screen or use play conrtol on your ear phones");
	}

	@Override
	public void changeTrack() {
		System.err.println("swipe to  change tracks");
	}

}

class CasettePlayer implements MusicPlayer {

	@Override
	public void play() {
		System.err.println("Press the play button");
		System.err.println("Play from casette");
	}

	@Override
	public void pause() {
		System.err.println("Press the pause button");
	}

	@Override
	public void changeTrack() {
		System.err.println("Rewind or fast-forward, stop, play");
	}
}

class Bird  implements MusicPlayer{
	@Override
	public void play() {
		System.err.println("Sing song when they see their master or whenever they feel like");
		System.err.println("Play through voice");
	}

	@Override
	public void pause() {
		System.err.println("when they are tired");
	}

	@Override
	public void changeTrack() {
		System.err.println("according to their mood");
	}
}