package edu.deizianeRodrigues.petMachine.project;

public class PetMachine {

	private boolean clean = true;

	private int water = 30;

	private int shampoo = 10;

	private Pet pet;

	public void takeAShower() {
		if (this.pet == null) {
			System.out.println("Coloque o pet na máquina para iniciar o banho");
			return;
		}
		this.water -= 10;
		this.shampoo -= 2;
		pet.setClean(true);
		System.out.println("O pet " + pet.getName() + " está limpo");
	}

	public void addWater() {
		if (water == 30) {
			System.out.println("A capacidade de água da maquina está no máximo");
			return;
		}

		water += 2;
	}

	public void addShampoo() {
		if (shampoo == 10) {
			System.out.println("A capacidade de shampoo da maquina está no máximo");
			return;
		}

		shampoo += 2;
	}

	public int getWater() {
		return water;
	}

	public int getShampoo() {
		return shampoo;
	}

	public boolean hasPet() {
		return pet != null;
	}

	public void setPet(Pet pet) {
		if (!this.clean) {
			System.out.println("A máquina esta suja, para colocar o pet é nescessario limpa-la");
			return;
		}
		if (hasPet()) {
			System.out.println("O pet " + this.pet.getName() + " está na máquina neste momento");
			return;

		}
		this.pet = pet;
		System.out.println("O pet " + pet.getName() + " foi colocado na máquina");

	}

	public void removePet() {
		if (this.pet == null) {
			System.out.println("Não há pet na máquina para remover.");
			return;
		}
		this.clean = this.pet.isClean();

		System.out.println("O pet " + pet.getName() + " foi retirado da máquina");
		this.pet = null;
		return;
	}

	public void wash() {
		this.water -= 10;
		this.shampoo -= 2;
		this.clean = true;
		System.out.println("A máquina está limpa");
	}
}
