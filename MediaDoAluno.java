package cursoIntensivoJava;

import java.util.Scanner;

public class MediaDoAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double media = notasDoAluno();
		System.out.printf("A nota do aluno é:  %.1f %n", media);

		String verificacao = verificacaoDeAprovacao(media);
		System.out.println(verificacao);

	}

	public static double notasDoAluno() {
		Scanner input = new Scanner(System.in);

		System.out.printf("Digite sua primeira nota: ");
		double a = input.nextDouble();

		System.out.printf("Digite sua segunda nota: ");
		double b = input.nextDouble();

		double media = (a + b) / 2;

		input.close();

		return media;

	}

	public static String verificacaoDeAprovacao(double media) {

		if (media >= 6.0) {
			return "Aluno aprovado!";
		} else {
			return "Aluno reprovado!";
		}
	}

}
