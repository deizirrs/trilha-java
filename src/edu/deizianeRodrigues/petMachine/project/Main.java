package edu.deizianeRodrigues.petMachine.project;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	static PetMachine petMachine = new PetMachine();

	public static void main(String[] args) {
		sc.useDelimiter("\\n");
		int option = -1;

		do {
			System.out.println("********* OPÇÕES ********");
			System.out.println("1 - Dar banho no pet");
			System.out.println("2 - Abastecer a máquina com água");
			System.out.println("3 - Abastecer a máquina com shampoo");
			System.out.println("4 - Verificar água da máquina");
			System.out.println("5 - Verificar shampoo da máquina");
			System.out.println("6 - Verificar se tem pet no banho");
			System.out.println("7 - Colocar pet na máquina");
			System.out.println("8 - Retirar pet na máquina");
			System.out.println("9 - Limpar máquina");
			System.out.println("0 - Sair");

			String input = sc.nextLine();
			if (input.matches("\\d+")) {
				option = Integer.parseInt(input);
			} else {
				System.out.println("Entrada inválida. Digite um número.");
				option = -1;
				continue;
			}

			switch (option) {
			case 1:
				petMachine.takeAShower();
				break;
			case 2:
				setWater();
				break;
			case 3:
				setShampoo();
				break;
			case 4:
				verifyWater();
				break;
			case 5:
				verifyShampoo();
				break;
			case 6:
				checkIfHasPetInMachine();
				break;
			case 7:
				setPetInPetMachine();
				break;
			case 8:
				petMachine.removePet();
				break;
			case 9:
				petMachine.wash();
				break;
			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("Opção inválido");

			}
		} while (option != 0);

	}

	private static void setShampoo() {
		System.out.println("Colocando Shampoo na máquina");
		petMachine.addShampoo();

	}

	private static void setWater() {
		System.out.println("Colocando água na máquina");
		petMachine.addWater();

	}

	private static void verifyWater() {
		int amount = petMachine.getWater();
		System.out.println("A máquina está com " + amount + " litro(s) de água");
	}

	private static void verifyShampoo() {
		int amount = petMachine.getShampoo();
		System.out.println("A máquina está com " + amount + " litro(s) de Shampoo");
	}

	private static void checkIfHasPetInMachine() {
		boolean hasPet = petMachine.hasPet();
		System.out.println(hasPet ? "Tem pet na máquina" : "Não tem pet na máquina");

	}

	public static void setPetInPetMachine() {
		String name = "";
		while (name == null || name.isEmpty()) {
			System.out.println("Informe o nome do Pet: ");
			name = sc.nextLine();
		}
		Pet pet = new Pet(name);
		petMachine.setPet(pet);

	}

}
