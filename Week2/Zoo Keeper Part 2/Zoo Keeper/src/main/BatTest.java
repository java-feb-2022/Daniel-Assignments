package main;

import animalPackage.Bat;

public class BatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bat batMan = new Bat();
		
		batMan.attackTown();
		batMan.attackTown();
		batMan.attackTown();
		batMan.displayEnergy();
		
		batMan.eatHumans();
		batMan.eatHumans();
		
		batMan.fly();
		batMan.fly();
		
		// Expected energy level: -50
		batMan.displayEnergy();
	}

}
