package cursoIntensivoJava;

import java.util.Scanner;

public class SistemaNotas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Calcular média de um aluno");
            System.out.println("2. Calcular médias de vários alunos");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

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
        double media = notasDoAluno(input);
        System.out.printf("A média do aluno é: %.1f%n", media);
        System.out.println(verificacaoDeAprovacao(media));
    }

    public static void calcularMediaVariosAlunos(Scanner input) {
        System.out.print("Quantos alunos deseja calcular as médias? ");
        int quantidade = input.nextInt();

        for (int i = 1; i <= quantidade; i++) {
            System.out.println("\nAluno " + i);
            calcularMediaAluno(input);
        }
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
            nota = input.nextDouble();
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
}
