package com.demo.oops;

public class PolymorphismWithInterfacesEx {
	public static void main(String[] args) {
		MusicPlayer1 musicPlayer1 = null;
		//Polymorphism : many forms
		// music player in many forms
		// dynammic : only during runtime
		// player known at runtime
		double randomNo = Math.random();
		if(randomNo > 0.7)
		musicPlayer1 = new IPhone1();
		else if (randomNo > 0.3) {
			musicPlayer1 = new CasettePlayer1();
		}
		else {
			musicPlayer1 = new Bird1();
		}
		musicPlayer1.play();
		musicPlayer1.pause();
		musicPlayer1.changeTrack();
	}
}
// interfaces have abstract methods
// can be implemented by any class
interface MusicPlayer1 {
//	public abstract void play();
//	abstract public void play();
	public void play();

	public abstract void pause();

	public abstract void changeTrack();
//	Abstract methods do not specify a body
//	public void on() {
//		
//	}
}

class IPhone1 implements MusicPlayer1 {

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

//	The method test() of type IPhone must override or implement a supertype method
//	@Override
//	public void test() {
//		
//	}
}

class CasettePlayer1 implements MusicPlayer1 {

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

class Bird1  implements MusicPlayer1{
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