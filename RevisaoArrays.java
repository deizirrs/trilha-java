package cursoIntensivoJava;

import java.util.Arrays;

public class RevisaoArrays {

	public static void main(String[] args) {
//		int[] numeros = new int[5];
//		
//		
//		numeros[0] = 1;
//		numeros[1] = 2;
//		numeros[2] = 3;
//		numeros[3] = 4;
//		numeros[4] = 5;
//		
//		for(int i = 0; i < numeros.length; i++) {
//			System.out.println(numeros[i]);
//			
//		}
		// Modo otimizado

		int[] numeros = { 1, 2, 3, 4, 5 };

		// Trazendo os valores dos elementos sem definição de laço

//			System.out.println(Arrays.toString(numeros));
		int menor = numeros[0];
		int maior = numeros[0];
		int media = 0;

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > maior) {
				maior = numeros[i];
			}
			if (numeros[i] < menor) {
				menor = numeros[i];
			}
			
			media += numeros[i];
		}
		System.out.println("Maior: " + maior);
		System.out.println("Maior: " + menor);
		System.out.println("Média: " + media/numeros.length);

	}
}
