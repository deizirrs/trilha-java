package cursoIntensivoJava;

import java.util.Scanner;

public class RevisaoDeFuncoes {

	public static void main(String[] args) {

		// Método sem retorno
		RevisaoDeFuncoes.somaSemRetorno();
		
		// Método com retorno e com paramêtros
		int resultado = RevisaoDeFuncoes.somaComRetorno(20);
		resultado += resultado;
		System.out.println(resultado);
		
		// Método com retorno
		String nome = saudacoes();
		System.out.println("Olá, " + nome + "!");

	}

	// Método com retorno
	public static String saudacoes() {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		String nome = input.nextLine();
		return nome;

	}
	
	// Método com retorno e com paramêtros
	
	public static int somaComRetorno(int a) {
		return a;
	}


	// Método sem retorno
	public static void somaSemRetorno() {
		int a = 7;
		int b = 1;
		int soma = a + b;
//		System.out.println(soma);
	}

}
