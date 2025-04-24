package edu.deiziane.exercicios;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		var male = new Person();
		male.setName(sc.next());
		male.setAge(sc.nextInt());
		male.setProfissao(sc.next());
		male.setCidadeNatal(sc.next());

		var female = new Person();
		female.setName(sc.next());
		female.setAge(sc.nextInt());
		female.setProfissao(sc.next());
		female.setCidadeNatal(sc.next());
		
		System.out.println("----Dados Pessoais----");
		System.out.println("Nome: " + male.getName());
		System.out.println("Idade: " + male.getAge());
		System.out.println("Profissão: " + male.getProfissao());
		System.out.println("Cidade Natal: " + male.getCidadeNatal());
		System.out.println("----------------------");
		System.out.println(" ");
		System.out.println("----Dados Pessoais----");
		System.out.println("Nome: " + female.getName());
		System.out.println("Idade: " + female.getAge());
		System.out.println("Profissão: " + female.getProfissao());
		System.out.println("Cidade Natal: " + female.getCidadeNatal());
		System.out.println("----------------------");
	}

}
