package main;

import animalPackage.Gorilla;

public class GorillaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gorilla grod = new Gorilla();
		
		// Throwing stuff:
		grod.throwSomething();
		grod.throwSomething("rock");
		grod.throwSomething("poop");
		
		// Eating:
		grod.eatBananas();
		grod.eatBananas();
		
		// Climb:
		grod.climb();
		
		// expected energy level: 95
		grod.displayEnergy();
	}

}
