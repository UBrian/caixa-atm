package arrays;

import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantos Aluno deseja cadastrar?");
		int qtdAlunos = entrada.nextInt();

		System.out.println("Quantas notas terá cada aluno?");
		int qtdNotas = entrada.nextInt();

		double[][] cadastro = new double[qtdAlunos][qtdNotas];

		double total = 0;
		for (int i = 0; i < cadastro.length; i++) {
			for (int j = 0; j < cadastro[i].length; j++) {
				System.out.printf("Informe a nota %d do aluno %d:", j + 1, i + 1);
				cadastro[i][j] = entrada.nextDouble();
				total += cadastro[i][j];
			}

		}
		double media = total / (qtdAlunos * qtdNotas);
		System.out.println("Média:" + media);
		entrada.close();
	}
}
