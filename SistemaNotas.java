package cursoIntensivoJava;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaNotas {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int opcao;

		do {
			System.out.println("\n======== MENU ========");
			System.out.println("1. Calcular média de um aluno");
			System.out.println("2. Calcular médias de vários alunos");
			System.out.println("3. Sair");
			System.out.println("======================");
			System.out.print("Escolha uma opção: ");
			opcao = input.nextInt();
			input.nextLine();

			switch (opcao) {
			case 1:
				calcularMediaAluno(input);
				break;
			case 2:
				calcularMediaVariosAlunos(input);
				break;
			case 3:
				System.out.println("Saindo do programa...");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
		} while (opcao != 3);

		input.close();
	}

	public static void calcularMediaAluno(Scanner input) {
		String[] aluno = coletarDadosAluno(input);
		String nome = aluno[0];
		double media = Double.parseDouble(aluno[1]);

		exibirResultadoAluno(nome, media);
		arquivarDados(nome, media);
	}

	public static void calcularMediaVariosAlunos(Scanner input) {
		ArrayList<String> nomes = new ArrayList<>();
		ArrayList<Double> medias = new ArrayList<>();

		System.out.print("Quantos alunos deseja calcular as médias? ");
		int quantidade = input.nextInt();
		input.nextLine();

		for (int i = 1; i <= quantidade; i++) {
			System.out.println("\nNome do Aluno " + i + ": ");
			String[] aluno = coletarDadosAluno(input);
			nomes.add(aluno[0]);
			medias.add(Double.parseDouble(aluno[1]));
		}

		System.out.println("\n======================");
		System.out.println("\n===== Resultados =====");
		System.out.println("\n======================");
		for (int i = 0; i < nomes.size(); i++) {
			exibirResultadoAluno(nomes.get(i), medias.get(i));
			arquivarDados(nomes.get(i), medias.get(i));
		}
	}

	public static String[] coletarDadosAluno(Scanner input) {
		System.out.print("Digite o nome completo do aluno (nome e sobrenome): ");
		String nome = input.nextLine().trim();
		double media = notasDoAluno(input);
		return new String[] { nome, String.valueOf(media) };
	}

	public static double notasDoAluno(Scanner input) {
		double nota1 = obterNotaValida(input, "Digite a primeira nota: ");
		double nota2 = obterNotaValida(input, "Digite a segunda nota: ");
		return (nota1 + nota2) / 2;
	}

	public static double obterNotaValida(Scanner input, String mensagem) {
		double nota;
		do {
			System.out.print(mensagem);
			while (!input.hasNextDouble()) {
				System.out.println("Entrada inválida! Digite um número.");
				System.out.print(mensagem);
				input.next();
			}
			nota = input.nextDouble();
			input.nextLine();
			if (nota < 0 || nota > 10) {
				System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
			}
		} while (nota < 0 || nota > 10);
		return nota;
	}

	public static String verificacaoDeAprovacao(double media) {
		if (media >= 6.0) {
			return "Aluno aprovado!";
		} else {
			return "Aluno reprovado!";
		}
	}

	public static void exibirResultadoAluno(String nome, double media) {
		System.out.printf("Aluno: %s | Média: %.1f | %s%n", nome, media, verificacaoDeAprovacao(media));
	}


	public static void arquivarDados(String nome, double media) {
		try (FileWriter writer = new FileWriter("resultados.txt", true)) {
			writer.write(String.format("Aluno: %s | Média: %.1f | %s%n", nome, media, verificacaoDeAprovacao(media)));
		} catch (IOException e) {
			System.out.println("Erro ao salvar no arquivo: " + e.getLocalizedMessage());
		}
	}
}
