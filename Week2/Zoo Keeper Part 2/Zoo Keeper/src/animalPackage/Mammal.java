package animalPackage;

public class Mammal {
	
	protected int energyLevel = 100;
	
	public int displayEnergy() {
		System.out.println("Energy Level: " + this.energyLevel);
		return this.energyLevel;
	}

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
}
