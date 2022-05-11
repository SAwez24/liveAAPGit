package com.demo.java8;

public class FunctionalInterfaceEx {

}

@FunctionalInterface
// only one abstract method
interface MusicPlayer1 {
//	public abstract void play();
//	abstract public void play();
	public void play();

//	public abstract void pause();
//
//	public abstract void changeTrack();
//	Abstract methods do not specify a body
//	public void on() {
//		
//	}
}

//@FunctionalInterface
//Invalid '@FunctionalInterface' annotation; MusicPlayer2 is not a functional interface
interface MusicPlayer2 {
	public abstract void play();
	public abstract void pause();
}