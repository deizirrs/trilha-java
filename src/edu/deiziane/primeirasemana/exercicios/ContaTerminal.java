package edu.deiziane.primeirasemana.exercicios;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);

		System.out.println("Por favor, digite o número da Conta: ");
		int numero = input.nextInt();

		System.out.println("Por favor, digite o número da Agência: ");
		String agencia = input.next();

		System.out.println("Digite o seu nome: ");
		String nomeCliente = input.next();

		System.out.println("Por favor, informe o seu saldo atual: ");
		double saldo = input.nextDouble();

		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
				+ agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
	}

}
