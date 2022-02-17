package animalPackage;

public class Bat extends Mammal {
	
	// private int energyLevel = 300;
	
	public Bat() {
		this.energyLevel = 300;
	}
	
	public void fly() {
		System.out.println("Eee EEE EEEEEEE! The giant bat takes off in flight!!!");
		this.energyLevel -= 50;
	}
	
	public void eatHumans() {
		System.out.println("Rip, squelch, crunch! The giant bat has consumed an entire human body...");
		this.energyLevel += 25;
	}
	
	public void attackTown() {
		System.out.println("Aaaahhh!! Eeeeeh!! *Crackling & Burning* ... The town burns as the bat flies away...");
		this.energyLevel -= 100;
	}
}
