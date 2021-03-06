package animalPackage;

public class Gorilla extends Mammal {
	
	public Gorilla() {
		super();
	}
	
	public void throwSomething() {
		System.out.println("The gorilla threw something!");
		this.energyLevel -= 5;
	}
	
	public void throwSomething(String object) {
		System.out.printf("The gorilla threw a %s!\n", object);
		this.energyLevel -= 5;
	}
	
	public void eatBananas() {
		System.out.println("The gorilla ate bananas and is very satisfied.");
		this.energyLevel += 10;
	}
	
	public void climb() {
		System.out.println("The gorilla climbed a tree!");
		this.energyLevel -= 10;
	}
}
